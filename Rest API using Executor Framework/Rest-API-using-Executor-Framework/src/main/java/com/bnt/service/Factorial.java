package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Factorial implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Factorial.class);

    private int number;

    public Factorial(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            logger.info("Factorial of " + number + " is: " + factorial + " (Thread: " + Thread.currentThread().getName() + ")");
            
        } catch (Exception e) {
            logger.error("Exception occurred while calculating factorial for " + number + ": " + e.getMessage());
        }
    }
    
}

