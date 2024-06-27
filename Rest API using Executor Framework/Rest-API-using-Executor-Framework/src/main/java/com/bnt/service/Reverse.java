package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Reverse implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Reverse.class);

    int number;

    public Reverse(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        try {
            int reversed = 0;
            
            int originalNumber = number;
            while (number != 0) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
                number /= 10;
            }
            logger.info("Reverse of number " + originalNumber + " is: " + reversed + " (Thread: " + Thread.currentThread().getName() + ")");
            
        } catch (Exception e) {
            logger.error("Exception occurred while calculating reverse of number " + number + ": " + e.getMessage());
        }
    }
    
}

