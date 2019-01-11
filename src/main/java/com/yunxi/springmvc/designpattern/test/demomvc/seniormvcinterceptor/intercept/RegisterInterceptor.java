package com.yunxi.springmvc.designpattern.test.demomvc.seniormvcinterceptor.intercept;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-21
 * @Description:
 */
@Configuration
public class RegisterInterceptor extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new FuckInterceptor());
        registry.addInterceptor(new ShitInterceptor());
        registry.addInterceptor(new ShadiaoInterceptor());
        registry.addInterceptor(new LzInterceptor());
        super.addInterceptors(registry);
    }
}
