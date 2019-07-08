package com.yunxi.springmvc.designpattern.test.adapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:29
 * @Description: 高级媒体播放器
 */
public interface AdvancedMediaPlayer {
    /**
     * 播放MKV
     * @param fileName
     */
    void playMKV(String fileName);

    /**
     * 播放mp4
     *
     * @param fileName
     */
    void playMP4(String fileName);
}
