package com.webcode.FunctionalInterfaces.Threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CallBackDemo {
    static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) throws ExecutionException, InterruptedException {



        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            delay(2);
            return "Jeevan Bodigam";
        }).thenApply(s -> s.concat(" reddy")).thenApply("welcome"::concat);

        String x = completableFuture.join();
        System.out.println(x);

    }
}
