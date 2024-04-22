package com.example.stock.common.service;

import com.example.stock.common.entity.Stocks;
import org.springframework.data.repository.CrudRepository;


public interface StocksRepository extends CrudRepository<Stocks,Integer> {
    Stocks findBySymbol(String symbol);
}
