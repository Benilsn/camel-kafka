package com.camel.camelappB.model;

import java.math.BigDecimal;

public class CurrencyExchange {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;

    public CurrencyExchange() {}

    public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
    }

    public Long getId() {
        return id;
    }

    public CurrencyExchange setId(Long id) {
        this.id = id;
        return this;
    }

    public String getFrom() {
        return from;
    }

    public CurrencyExchange setFrom(String from) {
        this.from = from;
        return this;
    }

    public String getTo() {
        return to;
    }

    public CurrencyExchange setTo(String to) {
        this.to = to;
        return this;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public CurrencyExchange setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
        return this;
    }


    @Override
    public String toString() {
        return "CurrencyExchange{" +
                "id=" + id +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", conversionMultiple=" + conversionMultiple +
                '}';
    }
}
