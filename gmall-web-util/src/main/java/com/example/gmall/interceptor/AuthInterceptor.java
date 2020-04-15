package com.example.gmall.interceptor;

import com.example.gmall.annotations.LoginRequired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class AuthInterceptor extends HandlerInterceptorAdapter {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handle){
        HandlerMethod hm = (HandlerMethod) handle;
        LoginRequired methodAnnotation = hm.getMethodAnnotation(LoginRequired.class);
        if(methodAnnotation==null){
            return true;
        }
        return false;
    }
}
