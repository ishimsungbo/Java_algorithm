package com.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Slf4jTest {

    private static Logger logger = LoggerFactory.getLogger(Slf4jTest.class);

    public static void main(String[] args) {
        for(int i =0 ; i < 10000 ;i++){
            //logger.debug("로그 ======================" + i);
            logger.info("로그 ======================" + i);
        }


    }
}
