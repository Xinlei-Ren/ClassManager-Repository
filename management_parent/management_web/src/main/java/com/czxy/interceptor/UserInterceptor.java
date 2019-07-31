package com.czxy.interceptor;

import com.czxy.domain.Contacts;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author huangdonghu
 * @version 1.0
 * @date 2019/7/31 20:20
 */
@Component
public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取当前的路径
        String s = request.getRequestURL().toString();
        if(s.endsWith("register.html")|| s.contains("login")||s.endsWith("js")||s.contains("layui")||s.contains("img") || s.endsWith("switch.html")||s.endsWith("css")){
            return true;
        }
        //获取session中的数据判断是否为null
        Contacts contacts = (Contacts) request.getSession().getAttribute("contacts");
        if(contacts==null){
            response.sendRedirect("/htm/contracts/switch.html");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
