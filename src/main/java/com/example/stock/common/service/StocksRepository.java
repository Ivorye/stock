package com.example.stock.common.service;

import com.example.stock.common.entity.Stocks;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface StocksRepository extends CrudRepository<Stocks,Integer> {
    @Query(value = "select * from stocks where symbol = :symbol",nativeQuery = true)
    List<Stocks> findBySymbol(String symbol);
}
