package com.camel.camelappA.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
//        from("file:camel-app-A/files/input")
//                .log("${body}")
//                .to("file:camel-app-A/files/output");
    }
}
