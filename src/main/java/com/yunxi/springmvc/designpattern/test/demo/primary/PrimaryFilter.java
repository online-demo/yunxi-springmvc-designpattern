package com.yunxi.springmvc.designpattern.test.demo.primary;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description: 初级玩家对问题的处理。特殊字符处理/加解密/美团id点评id互转
 */
public class PrimaryFilter {
    public static String content = "fuck，shit，沙雕产品经理的沙雕需求，老子不干了";
    public static void main(String[] args) {
        String filteredContent = content.replace("fuck", "****")
                .replace("shit", "****")
                .replace("沙雕", "sd")
                .replace("老子","lz");
        System.out.println(filteredContent);
    }
}
