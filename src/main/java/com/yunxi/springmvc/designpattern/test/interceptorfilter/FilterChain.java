package com.yunxi.springmvc.designpattern.test.interceptorfilter;

import com.yunxi.springmvc.designpattern.test.interceptorfilter.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description: 过滤器链
 */
public class FilterChain {
    //过滤器集合
    List<Filter> filterList = new ArrayList<>();
    private Target target;

    /**
     * 添加过滤器
     * @param filter
     */
    public void addFilter(Filter filter){
        filterList.add(filter);
    }

    /**
     * 执行过滤器
     * @param request
     */
    public void execute(String request){
        //前置拦截
        for (Filter filter : filterList) {
            request = filter.doFilter(request);
        }
        //执行目标对象
        target.execute(request);
        //后置拦截
        for (int i = 0; i < filterList.size(); i++) {
            Filter filter = filterList.get(i);
            filter.doPost(request);
        }
        //后置拦截
        for (int i = 0; i < filterList.size(); i++) {
            Filter filter = filterList.get(i);
            filter.doPublish();
        }
    }

    /**
     * 设置目标对象
     * @param target
     */
    public void setTarget(Target target){
        this.target = target;
    }
}
