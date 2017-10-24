package com.github.xenteros.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "default_table")
public class CurrencyExchangeEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String currencyTo;
    private BigDecimal valueFrom;
    private BigDecimal valueTo;
    private BigDecimal exchangeRate;
    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    public BigDecimal getValueFrom() {
        return valueFrom;
    }

    public void setValueFrom(BigDecimal valueFrom) {
        this.valueFrom = valueFrom;
    }

    public BigDecimal getValueTo() {
        return valueTo;
    }

    public void setValueTo(BigDecimal valueTo) {
        this.valueTo = valueTo;
    }
}
