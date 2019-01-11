package com.yunxi.springmvc.designpattern.test.demomvc.seniormvcinterceptor.intercept;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-21
 * @Description: fuck过滤
 */
public class FuckInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String shitFilter = request.getParameter("content").replace("fuck", "****");
        request.setAttribute("filteredContent", shitFilter);
        System.out.printf("FuckInterceptor preHandle方法执行。。。");
        System.out.println();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {
        System.out.printf("FuckInterceptor postHandle方法执行。。。");
        System.out.println();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                 @Nullable Exception ex) throws Exception {
        System.out.printf("FuckInterceptor afterCompletion方法执行。。。" );
        System.out.println();
    }
}
