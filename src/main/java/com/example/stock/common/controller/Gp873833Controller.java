package com.example.stock.common.controller;

import com.example.stock.common.entity.Gp873833;
import com.example.stock.common.service.Gp873833DailyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/stock")
public class Gp873833Controller {
    @Autowired
    private Gp873833DailyRepository dailyInfo;

    @RequestMapping(path = "/daily/gp873833")
    public Iterable<Gp873833> getAllDailies() {
        System.out.println("find all daily info, records"+dailyInfo.count());
        return dailyInfo.findAll();
    }
//    @RequestMapping(path = "/basic/gp873833",params = "873833")
//    public Optional<Gp873833> getStockByCode(Integer code){
//        return dailyInfo.findById(code);
//    }
}
