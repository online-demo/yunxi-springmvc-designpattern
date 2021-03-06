package com.yunxi.springmvc.designpattern.test.interceptorfilter.filter;

import org.springframework.util.StringUtils;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description:
 */
public class MyLzFilter implements Filter {
    /**
     * 过滤方法
     *
     * @param content
     */
    @Override
    public String doFilter(String content) {
        if (!StringUtils.isEmpty(content)) {
            return content.replace("老子", "lz");
        }
        return "";
    }

    /**
     * 后置处理方法
     *
     * @param content
     */
    @Override
    public void doPost(String content) {
        System.out.println("MyLzFilter执行结束");
    }

    /**
     * 发布时间
     */
    @Override
    public void doPublish() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("MyLzFilter结束时间=" + System.currentTimeMillis());
    }
}
