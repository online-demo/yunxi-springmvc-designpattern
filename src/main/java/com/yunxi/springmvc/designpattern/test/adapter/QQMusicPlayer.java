package com.yunxi.springmvc.designpattern.test.adapter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-08 14:31
 * @Description: QQ音乐播放器
 */
public class QQMusicPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    /**
     * 暴风音影支持的文件格式
     */
    public static String stormPlayerSupport = "MKV";

    /**
     * 快播支持的文件格式
     */
    public static  String qvodPlayerPlayerSupport = "MP4";

    /**
     * QQMusic支持的文件格式
     */
    public static  String qqMusicSupport = "MP3";

    @Override
    public void play(String audioType, String fileName) {

        //播放mp3
        if(audioType.equalsIgnoreCase(qqMusicSupport)){
            System.out.println("QQ音乐播放器正在播放："+ fileName);
        }
        //mediaAdapter 提供了播放其他文件格式的支持
        else if(audioType.equalsIgnoreCase(stormPlayerSupport)
                || audioType.equalsIgnoreCase(qvodPlayerPlayerSupport)){
            // 媒体适配器
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("无效的媒体类型。 不支持"+
                    audioType + "格式的文件");
        }
    }
}
