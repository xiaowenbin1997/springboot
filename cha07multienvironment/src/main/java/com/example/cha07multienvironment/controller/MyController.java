package com.example.cha07multienvironment.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
    @ResponseBody
    @RequestMapping("/hello")
    public String multiEnv() {
        return "spring boot multi environment";
    }
}
