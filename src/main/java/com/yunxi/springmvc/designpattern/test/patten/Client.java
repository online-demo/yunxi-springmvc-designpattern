package com.yunxi.springmvc.designpattern.test.patten;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description: 客户端
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
