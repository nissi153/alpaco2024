package com.study.Ex10Devtools;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("data", "서버데이터:888");
        return "index";
    }
    @GetMapping("/test")
    public String test(){
        return "test.html";
    }
}
