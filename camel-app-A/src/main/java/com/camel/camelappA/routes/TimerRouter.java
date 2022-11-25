package com.camel.camelappA.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Component
public class TimerRouter extends RouteBuilder {

    @Autowired
    private GetTime getTime;

    @Override
    public void configure() throws Exception {

//        from("timer:new-timer")
//                .bean(getTime, "currentTime")
//                .to("log:new-log");
    }
}

@Component
class GetTime {

    public String currentTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
    }
}
