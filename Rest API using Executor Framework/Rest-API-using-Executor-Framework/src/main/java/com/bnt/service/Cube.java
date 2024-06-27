package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cube implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(Cube.class);

    int number;

    public Cube(int number){
        this.number=number;
    }

    @Override
    public void run() {
      try {
        int result = number * number * number;
        logger.info("Cube of number " + number + " is: " + result + " (Thread: " + Thread.currentThread().getName() + ")");
    } catch (Exception e) {
        logger.error("Exception occurred while calculating cube for number " + number, e);
    }
    
    }
    
    
}
