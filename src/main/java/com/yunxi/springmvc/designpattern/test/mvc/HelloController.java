package com.yunxi.springmvc.designpattern.test.mvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2018-12-21
 * @Description: controller
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String test() {
        return "hello world !";
    }
}
