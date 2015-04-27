package com.technology.rediscenter.jetty;

import org.apache.log4j.PropertyConfigurator;

public class JettyStart {
    public static void main(String[] args) {
        //加载Log4j
        PropertyConfigurator.configure("config/log4j.properties");

        JettyCustomServer server =
            new JettyCustomServer("./config/jetty/jetty.xml", "/testContext");
        server.startServer();
    }
}