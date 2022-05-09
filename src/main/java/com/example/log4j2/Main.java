package com.example.log4j2;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

public class Main {
    static final Logger LOGGER = LogManager.getLogger(Main.class.getName());

    public static void main(String[] args) {
        reconfigureLog4j2Path("config/log4j2.xml");
        System.setProperty("-DLog4jContextSelector", "org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");

        //Uma aplicaï¿½ï¿½o simples que mostra o log no console
        LOGGER.debug("This is debug");
        LOGGER.info("This is info");
        LOGGER.error("This is error");
    }

    private static void reconfigureLog4j2Path(String args) {
        //reconfigure log4j2 in code with a specific configuration file
        LoggerContext context = (org.apache.logging.log4j.core.LoggerContext) LogManager.getContext(false);
        File file = new File(args);
        // this will force a reconfiguration
        context.setConfigLocation(file.toURI());
    }
}