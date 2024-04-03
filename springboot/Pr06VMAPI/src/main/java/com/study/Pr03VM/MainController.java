package com.study.Pr03VM;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/")
    public String main(){
        return "productList"; //productList.html로 응답함.
    }
    @GetMapping("/addProductForm")
    public String addProductForm(){
        return "addProductForm";
    }
    @GetMapping("/editProductForm")
    public String editProductForm(){
        return "editProductForm";
    }
}
