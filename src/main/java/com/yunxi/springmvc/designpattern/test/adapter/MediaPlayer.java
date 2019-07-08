package com.yunxi.springmvc.designpattern.test.adapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:29
 * @Description: 媒体播放器
 */
public interface MediaPlayer {
    /**
     * 播放文件
     *
     * @param audioType
     * @param fileName
     */
    void play(String audioType, String fileName);
}
