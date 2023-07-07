package com.webcode.FunctionalInterfaces.Threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableFutureSupplier {

    static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Supplier<String> supplier = ()->{
            delay(10);
//            System.out.println("Inside the thread "+ Thread.currentThread().getName());
            return "Hello World!!";
        };

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(supplier);



        String resultOfCompletableFuture = completableFuture.join();
        // join is non-blocking which executes the calling thread
        System.out.println("Inside the main thread");
        System.out.println(resultOfCompletableFuture);


    }
}
