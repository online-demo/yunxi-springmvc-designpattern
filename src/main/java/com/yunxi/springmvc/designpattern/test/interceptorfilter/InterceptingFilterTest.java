package com.yunxi.springmvc.designpattern.test.interceptorfilter;

import com.yunxi.springmvc.designpattern.test.interceptorfilter.filter.MyFuckFilter;
import com.yunxi.springmvc.designpattern.test.interceptorfilter.filter.MyLzFilter;
import com.yunxi.springmvc.designpattern.test.interceptorfilter.filter.MyShadiaoFilter;
import com.yunxi.springmvc.designpattern.test.interceptorfilter.filter.MyShitFilter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description: 测试类
 */
public class InterceptingFilterTest {
    public static void main(String[] args) {

        FilterManager filterManager = new FilterManager(new Target());
        //装配各种过滤器
        filterManager.setFilter(new MyFuckFilter());
        filterManager.setFilter(new MyShitFilter());
        filterManager.setFilter(new MyShadiaoFilter());
        filterManager.setFilter(new MyLzFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("fuck，shit，沙雕产品经理的沙雕需求，老子不干了");
    }
}