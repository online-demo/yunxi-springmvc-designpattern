package com.yunxi.springmvc.designpattern.test.abstractfactory;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description:
 */
public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("填充蓝色");
    }
}
