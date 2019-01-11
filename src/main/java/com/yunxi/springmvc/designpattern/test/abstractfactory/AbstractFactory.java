package com.yunxi.springmvc.designpattern.test.abstractfactory;

import com.yunxi.springmvc.designpattern.test.factory.Shape;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description:
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
