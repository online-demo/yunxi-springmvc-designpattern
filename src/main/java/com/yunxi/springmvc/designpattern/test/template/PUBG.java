package com.yunxi.springmvc.designpattern.test.template;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description:
 */
public class PUBG extends Game {

    @Override
    void endPlay() {
        System.out.println("结束PUBG游戏");
    }

    @Override
    void initialize() {
        System.out.println("初始化PUBG游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始PUBG游戏");
    }
}
