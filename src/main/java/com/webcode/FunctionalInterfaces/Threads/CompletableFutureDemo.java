package com.webcode.FunctionalInterfaces.Threads;

import java.util.concurrent.*;

public class CompletableFutureDemo {

    static void delay(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        // Using Runnable and default ForkJoinPool-commonPool
        Runnable runnable = () -> {
            delay(1);
            System.out.println("I am in thread pool"+ Thread.currentThread().getName());
        };

        // Creating our own ThreadPool
        ExecutorService executorService = Executors.newCachedThreadPool();

        // with default pool
//      CompletableFuture<Void> cs = CompletableFuture.runAsync(runnable);

        // with custom ThreadPool
        CompletableFuture<Void> cs1 = CompletableFuture.runAsync(runnable,executorService);

        System.out.println("i am in main thread.");
        cs1.join();
    }
}
