package com.yunxi.springmvc.designpattern.test.template;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description:
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new LOL();
        game.play();
        System.out.println("--------------------");
        game = new PUBG();
        game.play();
    }
}
