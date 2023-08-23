package com.example.project1.oops.java8features.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class LambdaUse {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> i= new ArrayList<>();
        Runnable thread1=()->{
            System.out.println("thread1"+Thread.currentThread());
            i.add(3);
        };
        Thread thread=new Thread(thread1);
        thread.start();
        Runnable thread2=()->{
            System.out.println("thread2"+Thread.currentThread());
            if(i.contains(3))
                i.add(4);
            else
                i.add(3);
        };
        thread=new Thread(thread2);
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println(i);

    }
}