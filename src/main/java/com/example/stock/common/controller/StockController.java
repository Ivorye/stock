package com.example.stock.common.controller;

import com.example.stock.common.entity.Stock;
import com.example.stock.common.entity.Stocks;
import com.example.stock.common.mapper.StockMapper;
import com.example.stock.common.service.StocksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class StockController {
    @Autowired
    private StocksRepository stocksRepository;
    @Autowired
    private StockMapper stockMapper;

    @GetMapping(path = {"/stock/all","stocks"})
    public Iterable<Stocks> getAllStockShares(){
        return stocksRepository.findAll();
    }

    @GetMapping("/allstocks")
    public List<Stock> getAllStocks(){
        return stockMapper.getAll();
    }

    @RequestMapping(path = "/stock/gp")
    public Stocks getBasicStock(@RequestParam("symbol") String code){
        return stocksRepository.findBySymbol(code);
    }
}
