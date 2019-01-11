package com.yunxi.springmvc.designpattern.test.factory;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description: 矩形
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("画一个矩形");
    }
}
