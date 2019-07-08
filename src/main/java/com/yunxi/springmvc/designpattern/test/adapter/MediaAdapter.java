package com.yunxi.springmvc.designpattern.test.adapter;

import static com.yunxi.springmvc.designpattern.test.adapter.QQMusicPlayer.qvodPlayerPlayerSupport;
import static com.yunxi.springmvc.designpattern.test.adapter.QQMusicPlayer.stormPlayerSupport;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:31
 * @Description: 媒体适配器
 */
public class MediaAdapter implements MediaPlayer {


    /**
     * 高级媒体播放器
     */
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        // 播放MKV文件
        if(audioType.equalsIgnoreCase(stormPlayerSupport) ){
            advancedMusicPlayer = new StormPlayer();
            // 播放MP4文件
        } else if (audioType.equalsIgnoreCase(qvodPlayerPlayerSupport)){
            advancedMusicPlayer = new QvodPlayerPlayer();
        }
    }

    /**
     * 适配器可以使用不同的播放器去播放各种媒体
     *
     * @param audioType
     * @param fileName
     */
    @Override
    public void play(String audioType, String fileName) {
        // 播放MKV文件
        if(audioType.equalsIgnoreCase(stormPlayerSupport)){
            advancedMusicPlayer.playMKV(fileName);
            // 播放MP4文件
        }else if(audioType.equalsIgnoreCase(qvodPlayerPlayerSupport)){
            advancedMusicPlayer.playMP4(fileName);
        }
    }
}
