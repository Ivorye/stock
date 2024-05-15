package com.example.stock.common.entity;

import java.util.Date;

public class gphistory {
    private Date tradeDate;
    private Double openp;
    private Double high;
    private Double low;
    private Double closep;
    private Double preclose;
    private Double changes;
    private Double pctChg;
    private Double vol;
    private Double amount;

    public Date getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Date tradeDate) {
        this.tradeDate = tradeDate;
    }

    public Double getOpenp() {
        return openp;
    }

    public void setOpenp(Double openp) {
        this.openp = openp;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

    public Double getLow() {
        return low;
    }

    public void setLow(Double low) {
        this.low = low;
    }

    public Double getClosep() {
        return closep;
    }

    public void setClosep(Double closep) {
        this.closep = closep;
    }

    public Double getPreclose() {
        return preclose;
    }

    public void setPreclose(Double preclose) {
        this.preclose = preclose;
    }

    public Double getChanges() {
        return changes;
    }

    public void setChanges(Double changes) {
        this.changes = changes;
    }

    public Double getPctChg() {
        return pctChg;
    }

    public void setPctChg(Double pctChg) {
        this.pctChg = pctChg;
    }

    public Double getVol() {
        return vol;
    }

    public void setVol(Double vol) {
        this.vol = vol;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
