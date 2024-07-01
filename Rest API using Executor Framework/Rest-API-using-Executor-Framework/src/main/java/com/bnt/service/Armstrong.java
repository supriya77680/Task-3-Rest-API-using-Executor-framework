package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Armstrong implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Armstrong.class);

    int number;
    String result;

    public Armstrong(int number) {
        this.number = number;
    }

    public String getArmstrong(String result){
        try {
            int originalNumber = number;
            int sum = 0;
            int digits = String.valueOf(number).length();
            
            while (number > 0) {
                int digit = number % 10;
                sum += Math.pow(digit, digits);
                number /= 10;
            }
            
            if (sum == originalNumber) {
                logger.info(originalNumber + " is an Armstrong number. (Thread: " + Thread.currentThread().getName() + ")");
            } else {
                logger.info(originalNumber + " is not an Armstrong number. (Thread: " + Thread.currentThread().getName() + ")");
            }
            
        } catch (Exception e) {
            logger.error("Exception occurred while checking Armstrong number for " + number + ": " + e.getMessage());
        }
        return "Result of Armstrong is out";
    }

    @Override
    public void run() {
     getArmstrong(result);
    }
    
}

