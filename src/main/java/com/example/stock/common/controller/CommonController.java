package com.example.stock.common.controller;


import com.example.stock.common.entity.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CommonController {

    @Value("${spring.application.name}")
    private String name;
    @Value("${spring.application.welc}")
    private String welcome;
    @RequestMapping("/hello")
    public String hello(){
        return name+" "+welcome;
    }
}
