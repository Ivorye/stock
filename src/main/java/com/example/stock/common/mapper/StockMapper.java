package com.example.stock.common.mapper;

import com.example.stock.common.entity.Stock;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface StockMapper {

    @Select("select * from stocks")
    public List<Stock> getAll();
}
