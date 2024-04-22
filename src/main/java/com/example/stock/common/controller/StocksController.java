package com.example.stock.common.controller;

import com.example.stock.common.entity.Stocks;
import com.example.stock.common.service.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/stock")
public class StocksController {
    @Autowired
    private StocksRepository stocksRepository;

    @RequestMapping(path = "/all")
    public Iterable<Stocks> getAllStockShares(){
        System.out.println("find all stocks......");
        return stocksRepository.findAll();
    }

    @RequestMapping(path = "/stock/gp873833")
    public Stocks getBasicStock(String code){
        return stocksRepository.findBySymbol(code);
    }
}
