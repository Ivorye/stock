package com.example.stock.common.entity;

import jakarta.persistence.Table;

@Table(name = "stocks")
public class Stock {

    private Integer id;
    private String symbol;
    private String stcode;
    private String fullname;
    private String listDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getStcode() {
        return stcode;
    }

    public void setStcode(String stcode) {
        this.stcode = stcode;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getListDate() {
        return listDate;
    }

    public void setListDate(String listDate) {
        this.listDate = listDate;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", symbol='" + symbol + '\'' +
                ", stcode='" + stcode + '\'' +
                ", fullname='" + fullname + '\'' +
                ", listDate='" + listDate + '\'' +
                '}';
    }
}
