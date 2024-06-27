package com.bnt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bnt.service.*;

import jakarta.annotation.PreDestroy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@RestController
public class ControllerClass {

    private final ExecutorService executorService;

    public ControllerClass() {
        // Create a fixed thread pool executor
        this.executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
    }

    @GetMapping("/number/{number}")
    public void operation(@PathVariable int number) {
        Runnable[] runnables = {
            new Square(number),
            new Cube(number),
            new EvenOdd(number),
            new Prime(number),
            new Armstrong(number),
            new Factorial(number),
            new Palindrome(number),
            new Reverse(number)
        };

        for (Runnable runnable : runnables) {
            executorService.submit(runnable);
        }
    }

    @PreDestroy
public void shutdownExecutor() {
    executorService.shutdown();
    try {
        if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
            executorService.shutdownNow();
        }
    } catch (InterruptedException e) {
        executorService.shutdownNow();
    }
}
}