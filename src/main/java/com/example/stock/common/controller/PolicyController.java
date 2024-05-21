package com.example.stock.common.controller;

import com.example.stock.common.entity.Gphistory;
import com.example.stock.common.entity.Stock;
import com.example.stock.common.entity.Stocks;
import com.example.stock.common.entity.TransactionDetail;
import com.example.stock.common.mapper.GphistoryMapper;
import com.example.stock.common.mapper.StockMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class PolicyController {

    @Autowired
    GphistoryMapper gphistoryMapper;
    @Autowired
    StockMapper stockMapper;

    @GetMapping("/stocks/{period}daysup{ratio}")
    public List<String> getUpRation(@PathVariable int period, @PathVariable double ratio){
        List<Stock> stocks = stockMapper.getAll();
        ArrayList<String> stockList = new ArrayList<>();// = new ArrayList<String>();
        int i = 0;
        for (Stock stock:stocks) {
            String string = stock.getSymbol();
            String table = "gp"+ string;
            List<TransactionDetail> list1 = gphistoryMapper.getTransactionPerPeriod(table,period);
            double price1 = list1.get(list1.size()-1).getClosep();
            double price2 = list1.get(0).getClosep();
            double rate = 1 + ratio/100.00;
            if (price2>price1*rate){
                i++;
                System.out.println(table+"list size:"+ list1.size()+"~"+list1.get(list1.size()-1).getTradeDate()+
                        "~"+price1+"||"+ list1.get(0).getTradeDate()+"~"+price2+" *"+rate+"||"+i);
                stockList.add(string);
            }

        }
        System.out.println("stockList.size():"+stockList.size());
        return stockList;
    }


}
