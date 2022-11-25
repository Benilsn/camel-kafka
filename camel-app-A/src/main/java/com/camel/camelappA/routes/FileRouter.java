package com.camel.camelappA.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:camel-app-A/files/input")
                .routeId("Files-input-Route")
                .transform().body(String.class)
                .choice()
                    .when(simple("${file:ext} ends with 'xml'"))
                        .log("XML FILE")
                    .when(simple("${body} contains 'USD'"))
                        .log("Not XML but contain USD")
                    .otherwise()
                        .log("Not XML FILE")
                .end()
                .log("${body}")
                .to("file:camel-app-A/files/output");
    }
}
