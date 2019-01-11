package com.yunxi.springmvc.designpattern.test.demomvc.seniormvcinterceptor.intercept;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-21
 * @Description: 沙雕过滤
 */
public class ShadiaoInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String shitFilter = ((String)request.getAttribute("filteredContent")).replace("沙雕", "sd");
        request.setAttribute("filteredContent", shitFilter);
        System.out.printf("ShadiaoInterceptor preHandle方法执行。。。");
        System.out.println();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {
        System.out.printf("ShadiaoInterceptor postHandle方法执行。。。");
        System.out.println();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                 @Nullable Exception ex) throws Exception {
        System.out.printf("ShadiaoInterceptor afterCompletion方法执行。。。");
        System.out.println();
    }
}
