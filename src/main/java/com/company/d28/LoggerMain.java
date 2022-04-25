package com.company.d28;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerMain {
    private static Logger LOGGER = LoggerFactory.getLogger(LoggerMain.class);

    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                LOGGER.trace("Hello SLF4J!");
//                LOGGER.debug("Hello SLF4J!");
//                LOGGER.info("Hello SLF4J!");
//                LOGGER.error("Hello SLF4J!");
//
//            }
//        }).start();
        max(1,5);
    }
    public static int max(int a, int b){
        LOGGER.info("Calculating the max for the given a{} and b{}", a,b);
        return a>b ? a:b;
    }
}
