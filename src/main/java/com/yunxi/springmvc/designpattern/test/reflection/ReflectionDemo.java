package com.yunxi.springmvc.designpattern.test.reflection;

import java.lang.reflect.Field;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description: 反射
 */
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        User user = new User();
//        user.name
        Field field = user.getClass().getDeclaredField("name");
//        field.setAccessible(true);
        String name = (String) field.get(user);
        System.out.println("userName = " + name);
        field.set(user, "云析学院");
        name = (String) field.get(user);
        System.out.println("userName = " + name);
    }
}
