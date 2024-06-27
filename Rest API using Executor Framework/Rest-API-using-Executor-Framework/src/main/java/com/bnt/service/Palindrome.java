package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Palindrome implements Runnable {

    private static final Logger logger = LoggerFactory.getLogger(Palindrome.class);

    int number;

    public Palindrome(int number) {
        this.number = number;
    }
    @Override
    public void run() {
        try {
            int originalNumber = number;
            int reversedNumber = 0;
            
            while (number != 0) {
                int digit = number % 10;
                reversedNumber = reversedNumber * 10 + digit;
                number /= 10;
            }
            if (originalNumber == reversedNumber) {
                logger.info(originalNumber + " is a palindrome. (Thread: " + Thread.currentThread().getName() + ")");
            } else {
                logger.info(originalNumber + " is not a palindrome. (Thread: " + Thread.currentThread().getName() + ")");
            }
            
        } catch (Exception e) {
            logger.error("Exception occurred while checking palindrome for number " + number + ": " + e.getMessage());
        }
    }
    
}

