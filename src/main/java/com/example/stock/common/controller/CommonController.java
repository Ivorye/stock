package com.example.stock.common.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CommonController {

    @Value("${spring.application.name}")
    private String name;
    @Value("${spring.application.welc}")
    private String welcome;
    @RequestMapping("/")
    public String index(){
        return name+" "+welcome+"!33333";
    }
}
