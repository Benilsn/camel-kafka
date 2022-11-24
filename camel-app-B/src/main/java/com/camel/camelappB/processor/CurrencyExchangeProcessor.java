package com.camel.camelappB.processor;

import com.camel.camelappB.model.CurrencyExchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CurrencyExchangeProcessor {

    Logger logger = LoggerFactory.getLogger(CurrencyExchangeProcessor.class);

    public void processMessage(CurrencyExchange currencyExchange){
        logger.info("Before Transform: {}",currencyExchange);
    }
}
