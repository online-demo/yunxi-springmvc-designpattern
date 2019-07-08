package com.yunxi.springmvc.designpattern.test.adapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:32
 * @Description:
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {

        QQMusicPlayer audioPlayer = new QQMusicPlayer();
        audioPlayer.play("mp3", "如果这都不算爱.mp3");
        audioPlayer.play("mp4", "天下无贼.mp4");
        audioPlayer.play("mkv", "流浪地球.mkv");
        audioPlayer.play("avi", "苍老师.avi");
    }
}
