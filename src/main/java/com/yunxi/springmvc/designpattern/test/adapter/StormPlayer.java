package com.yunxi.springmvc.designpattern.test.adapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:30
 * @Description: 暴风音影播放器
 */
public class StormPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMKV(String fileName) {
        System.out.println("暴风音影播放器正在播放: "+ fileName);
    }

    @Override
    public void playMP4(String fileName) {
        //什么也不做
    }
}
