package com.example.project1.oops.async;

import java.util.concurrent.CompletableFuture;

public class Async {
    public static void main(String[] args) {
        CompletableFuture<String> name1=CompletableFuture.supplyAsync(Async::print);

        CompletableFuture<String> name2=CompletableFuture.supplyAsync(Async::print);

        System.out.println("Main Thread" );

    }
    static String print(){
        System.out.println(Thread.currentThread().getName());
        return Thread.currentThread().getName() ;
    }
}
