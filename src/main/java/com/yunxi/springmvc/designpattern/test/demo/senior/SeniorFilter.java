package com.yunxi.springmvc.designpattern.test.demo.senior;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-22
 * @Description: fuck，shit，沙雕产品经理的沙雕需求，老子不干了
 */
@RestController
public class SeniorFilter {
    @RequestMapping("/senior/filter")
    public void filter(HttpServletRequest request) {
        System.out.println(request.getAttribute("filteredContent"));
    }
}