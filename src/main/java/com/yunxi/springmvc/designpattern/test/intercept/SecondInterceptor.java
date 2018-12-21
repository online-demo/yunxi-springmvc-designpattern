package com.yunxi.springmvc.designpattern.test.intercept;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-21
 * @Description:
 */
public class SecondInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        System.out.printf("进入第2个拦截器preHandle。。。" + request.getRequestURL());
        System.out.println();
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {
        System.out.printf("进入第2个拦截器postHandle。。。" + request.getRequestURL());
        System.out.println();
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                 @Nullable Exception ex) throws Exception {
        System.out.printf("进入第2个拦截器afterCompletion。。。" + request.getRequestURL());
        System.out.println();
    }
}
