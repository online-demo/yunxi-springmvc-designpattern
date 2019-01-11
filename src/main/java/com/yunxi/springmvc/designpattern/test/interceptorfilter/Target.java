package com.yunxi.springmvc.designpattern.test.interceptorfilter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description:
 */
public class Target {
    public void execute(String request){
        System.out.println("request=" + request);
    }
}
