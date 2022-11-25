package com.camel.camelappA.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQPublisherRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("timer:active-mq-timer?period=10000")
                .transform().constant("Message to ActiveMQ")
                .to("activemq:my-queue");

        from("file:camel-app-A/files/json")
                .log("${body}")
                .to("activemq:my-queue-json");

        from("file:camel-app-A/files/xml")
                .log("${body}")
                .to("activemq:my-queue-xml");

    }


}
