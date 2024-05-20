package com.example.stock.common.controller;

import com.example.stock.common.entity.TransactionDetail;
import com.example.stock.common.mapper.GphistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.example.stock.common.mapper.GphistoryMapper.*;

@RestController
public class GphistoryController {

    @Autowired
    GphistoryMapper gphistoryMapper;

    @GetMapping("/stock/history/{id}")
    public List<TransactionDetail> getTransactionHist(@PathVariable String id){
        String table = "gp"+id;
        System.out.println(table);

        return gphistoryMapper.getTransactionHist(table);
    }
}
