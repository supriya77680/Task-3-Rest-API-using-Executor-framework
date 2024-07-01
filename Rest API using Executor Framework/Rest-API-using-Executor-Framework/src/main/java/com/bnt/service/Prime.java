package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Prime implements Runnable {

    public static final Logger logger = LoggerFactory.getLogger(Prime.class);

    int number;
    Integer result;

    public Prime(int number) {
        this.number = number;
    }

    public Boolean getPrime(Integer result){
        
        try {
            boolean isPrime = true;
             isPrime = true;
            
            if (number <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            
            if (isPrime) {
                logger.info(number + " is prime. (Thread: " + Thread.currentThread().getName() + ")");
            } else {
                logger.info(number + " is not prime. (Thread: " + Thread.currentThread().getName() + ")");
            }
            
        } catch (Exception e) {
            logger.error("Exception occurred during prime check for number " + number + ": " + e.getMessage());
        }
        return true;
    }


    @Override
    public void run() {
        getPrime(result);
}
}
    
