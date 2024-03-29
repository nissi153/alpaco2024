package com.study.Ex02SpringDI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SecondController {
    @GetMapping("/second")
    @ResponseBody
    public String second(){
        return "second()";
    }
}
