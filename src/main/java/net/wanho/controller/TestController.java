package net.wanho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class TestController {
    @RequestMapping("hello")
    public String hello(Map map ){
        map.put("msg","asen");
        return "hello";
    }

}
