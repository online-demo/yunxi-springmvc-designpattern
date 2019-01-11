package com.yunxi.springmvc.designpattern.test.template;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-01-11
 * @Description:
 */
public class LOL extends Game {

    @Override
    void endPlay() {
        System.out.println("结束LOL游戏");
    }

    @Override
    void initialize() {
        System.out.println("初始化LOL游戏");
    }

    @Override
    void startPlay() {
        System.out.println("开始LOL游戏");
    }
}