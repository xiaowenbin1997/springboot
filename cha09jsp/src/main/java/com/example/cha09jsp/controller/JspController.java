package com.example.cha09jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {

    @RequestMapping("/myjsp")
    public String retJsp(Model model){
        model.addAttribute("data","jsp");
        return "index";
    }
}
