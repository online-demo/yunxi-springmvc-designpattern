package com.yunxi.springmvc.designpattern.test.patten;

import com.yunxi.springmvc.designpattern.test.patten.filter.Filter;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description: 过滤器管理员
 */
public class FilterManager {
    private FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
