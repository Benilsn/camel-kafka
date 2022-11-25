package com.camel.camelappA.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisherRouter extends RouteBuilder {

    @Override

    public void configure() throws Exception {

//        from("file:camel-app-A/files/json")
//                .log("${body}")
//                .to("kafka:KafkaTopic");

    }


}
