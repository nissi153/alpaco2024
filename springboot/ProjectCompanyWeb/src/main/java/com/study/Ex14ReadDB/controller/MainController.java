package com.study.Ex14ReadDB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(){
        return "first"; //first.html로 응답
    }
}
