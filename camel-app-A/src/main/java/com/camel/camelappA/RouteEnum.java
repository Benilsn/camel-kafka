package com.camel.camelappA;

public enum RouteEnum {

    MY_QUEUE("activemq:my_queue","1"),
    ACTIVEMQ_JSON_QUEUE("activemq:my_queue_json","2"),
    ACTIVEMQ_XML_QUEUE("activemq:xml","3"),

    FILE_PATH_JSON("file:camel-app-A/files/json","4"),
    FILE_PATH_XML("file:camel-app-A/files/xml","5");


    public String route;
    public String number;

    RouteEnum(String route, String number){
        this.route = route;
        this.number = number;
    }
}
