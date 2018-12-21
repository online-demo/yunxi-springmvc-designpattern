package com.yunxi.springmvc.designpattern.test.intercept;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-21
 * @Description:
 */
@Configuration
public class RegisterInterceptor extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FirstInterceptor());
        registry.addInterceptor(new SecondInterceptor());
        super.addInterceptors(registry);
    }
}
