package com.yunxi.springmvc.designpattern.test.abstractfactory;

import com.yunxi.springmvc.designpattern.test.factory.Circle;
import com.yunxi.springmvc.designpattern.test.factory.Rectangle;
import com.yunxi.springmvc.designpattern.test.factory.Shape;
import com.yunxi.springmvc.designpattern.test.factory.Square;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description:
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}