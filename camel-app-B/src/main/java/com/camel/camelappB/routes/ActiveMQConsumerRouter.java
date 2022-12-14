package com.camel.camelappB.routes;

import com.camel.camelappB.model.CurrencyExchange;
import com.camel.camelappB.processor.CurrencyExchangeProcessor;
import com.camel.camelappB.transformer.CurrencyExchangeTransformer;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQConsumerRouter extends RouteBuilder {

    @Autowired
    private CurrencyExchangeProcessor currencyExchangeProcessor;

    @Autowired
    private CurrencyExchangeTransformer currencyExchangeTransformer;

    @Override
    public void configure() throws Exception {

        from("activemq:my-queue")
                .to("log:Message received = ${body}");

        from("activemq:my-queue-json")
                .unmarshal().json(JsonLibrary.Jackson, CurrencyExchange.class)
                .bean(currencyExchangeProcessor, "processMessage")
                .bean(currencyExchangeTransformer, "transformMessage")
                .log("After Transform: "+ body())
                .to("log:Message received = ${body}");

        from("activemq:my-queue-xml")
                .unmarshal().jacksonXml(CurrencyExchange.class)
                .bean(currencyExchangeProcessor, "processMessage")
                .bean(currencyExchangeTransformer, "transformMessage")
                .log("After Transform: "+ body())
                .to("log:Message received = ${body}");
    }

}
