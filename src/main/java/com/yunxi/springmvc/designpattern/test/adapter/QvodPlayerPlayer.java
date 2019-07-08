package com.yunxi.springmvc.designpattern.test.adapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:31
 * @Description: 快播视频播放器
 */
public class QvodPlayerPlayer implements AdvancedMediaPlayer{

    @Override
    public void playMKV(String fileName) {
        //什么也不做
    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("快播视频播放器正在播放: "+ fileName);
    }
}

