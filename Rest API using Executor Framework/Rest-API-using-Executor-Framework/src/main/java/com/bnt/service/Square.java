    package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Runnable{

        public static final Logger logger = LoggerFactory.getLogger(Square.class);

        int number;

        public Square(int number) {
            this.number = number;
        }

        @Override
        public void run() {
            try {
                int result = number * number;
                logger.info("Square of number " + number + " is: " + result + " (Thread: " + Thread.currentThread().getName() + ")");
            } catch (Exception e) {
                logger.error("Exception occurred while calculating square for number " + number, e);
            }
        }
        
    }
