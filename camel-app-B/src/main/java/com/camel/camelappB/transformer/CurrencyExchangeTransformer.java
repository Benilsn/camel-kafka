package com.camel.camelappB.transformer;

import com.camel.camelappB.model.CurrencyExchange;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CurrencyExchangeTransformer {

    public CurrencyExchange transformMessage(CurrencyExchange currencyExchange){
        currencyExchange.setConversionMultiple(
                currencyExchange.getConversionMultiple().multiply(BigDecimal.TEN)
        );

        return currencyExchange;
    }
}
