    package com.bnt.service;

    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;

    public class EvenOdd implements Runnable{

        private static final Logger logger = LoggerFactory.getLogger(EvenOdd.class);

        int number;

    
        public EvenOdd(int number) {
            this.number = number;
        }

        @Override
    public void run() {
        try {
            if (number % 2 == 0) {
                logger.info(number + " is even. (Thread: " + Thread.currentThread().getName() + ")");
            } else {
                logger.info(number + " is odd. (Thread: " + Thread.currentThread().getName() + ")");
            }
        } catch (ArithmeticException e) {
            logger.error("ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            logger.error("Exception occurred: " + e.getMessage());
        }
    }
    }
        
