package com.bnt.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cube implements Runnable{

    private static final Logger logger = LoggerFactory.getLogger(Cube.class);

    Integer result;
    int number;

    public Cube(int number){
        this.number=number;
    }

    public int getCubeResult(Integer result){
        try {
            logger.info("Cube of number " + number + " is: " + result + " (Thread: " + Thread.currentThread().getName() + ")");
        } catch (Exception e) {
            logger.error("Exception occurred while calculating cube for number " + number, e);
        }
        return result = number * number * number;
    }

    @Override
    public void run() {
        getCubeResult(result);
    }
    
    
}
