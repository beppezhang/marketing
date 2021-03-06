package bz.sunlight.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bz.sunlight.constant.HttpConstant;




/**
 * CookieUtil
 * 
 * @author sxc
 */
public class CookieUtil {

    private HttpServletRequest  request;
    private HttpServletResponse response;
    private int                 age;     // 设置cookie经过多长秒后被删除

    public CookieUtil(HttpServletRequest request, HttpServletResponse response, int age){
        this.request = request;
        this.response = response;
        this.age = age;
    }
    
    public CookieUtil (HttpServletRequest request, HttpServletResponse response)
    {
        this.request = request;
        this.response = response;   
        this.age = HttpConstant.COOOKIEEXPIRESUTC;
    }

    public void addCookie(String name, String value) {
        Cookie cookies = new Cookie(name, value);
        cookies.setPath("/");
        // cookies.setMaxAge(-1);//设置cookie经过多长秒后被删除。如果0，就说明立即删除。如果是负数就表明当浏览器关闭时自动删除。
        cookies.setMaxAge(age);
        response.addCookie(cookies);
    }

    public String getCookieValue(String cookieName) {
        if (cookieName != null) {
            Cookie cookie = getCookie(cookieName);
            if (cookie != null) {
                return cookie.getValue();
            }
        }
        return null;
    }

    public Cookie getCookie(String cookieName) {
        Cookie[] cookies = request.getCookies();
        Cookie cookie = null;
        try {
            if (cookies != null && cookies.length > 0) {
                for (int i = 0; i < cookies.length; i++) {
                    cookie = cookies[i];
                    if (cookie.getName().equals(cookieName)) {
                        return cookie;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean deleteCookie(String cookieName) {
        if (cookieName != null) {
            Cookie cookie = getCookie(cookieName);
            if (cookie != null) {
                cookie.setMaxAge(0);// 如果0，就说明立即删除
                cookie.setPath("/");// 不要漏掉
                response.addCookie(cookie);
                return true;
            }
        }
        return false;
    }


    public void deleteAllCookies() {
        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length > 0) {
        	for (Cookie cookie : cookies) {
                cookie.setMaxAge(0);
                cookie.setPath("/");
                response.addCookie(cookie);
        	}
        }
    }

    public static void main(String[] args) {
//         CookieUtil util=new CookieUtil(request,response,-1);
//         util.addCookie("name","value");
//         String value=util.getCookieValue("name");
//         System.out.println("value="+value);
    }
}
