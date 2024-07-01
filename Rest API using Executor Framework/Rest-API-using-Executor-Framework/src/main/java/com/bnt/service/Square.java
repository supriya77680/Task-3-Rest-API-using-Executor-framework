    package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Square implements Runnable{
    
    public static final Logger logger = LoggerFactory.getLogger(Square.class);

    Integer result;
    int number;

    public Square(int number) {
        this.number = number;
    }
    
        public Integer getSquareResult(Integer result){  

            try {
                logger.info("Square of number " + number + " is: " + result + " (Thread: " + Thread.currentThread().getName() + ")");

            } catch (Exception e) {
                logger.error("Exception occurred while calculating square for number " + number, e);
            }
            return result*result;
        }

        @Override
        public void run() {
           getSquareResult(result);
        }
        
    }
