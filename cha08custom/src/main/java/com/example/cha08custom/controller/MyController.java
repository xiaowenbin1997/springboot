package com.example.cha08custom.controller;


import com.example.cha08custom.vo.SchoolInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class MyController {

    @Value("${server.port}")
    private Integer port;
    @Value("${server.servlet.context-path}")
    private String path;

    @Resource
    private SchoolInfo schoolInfo;

    @ResponseBody
    @RequestMapping("/data")
    public String queryData() {
        return port + " , " + path;
    }

    @RequestMapping("/info")
    @ResponseBody
    public String queryScholl() {
        return "school info = " + schoolInfo;
    }
}
