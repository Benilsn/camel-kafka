package com.camel.camelappB.controllers;


import com.camel.camelappB.model.CurrencyExchange;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange returns(@PathVariable("from") String from, @PathVariable("to") String to){
        return new CurrencyExchange(10L, from, to, BigDecimal.TEN);
    }


}
