package com.study.Pr03VM;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class RestAPIController {
    public static List<Product> list = new ArrayList<>();

    public RestAPIController(){
        Product product1 = Product.builder()
                .name("소고기버거")
                .price(2000)
                .limit_date(LocalDate.parse("2024-01-01")).build();
        list.add( product1 );
        Product product2 = Product.builder()
                .name("토마토버거")
                .price(3000)
                .limit_date(LocalDate.parse("2024-02-01")).build();
        list.add( product2 );
        Product product3 = Product.builder()
                .name("배추버거")
                .price(4000)
                .limit_date(LocalDate.parse("2024-03-01")).build();
        list.add( product3 );
    }

    @GetMapping("/products")
    public List<Product> products(){
        return list;
    }
}
