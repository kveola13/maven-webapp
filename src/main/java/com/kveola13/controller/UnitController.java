package com.kveola13.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UnitController {
    @RequestMapping("/")
    public String display(){
        return "This should show the index";
    }
}
