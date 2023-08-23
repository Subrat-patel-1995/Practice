package com.example.project1.oops.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.*;
@Slf4j
public class Async extends Thread{
//    HashSet<Integer> set=new HashSet<>();
    private List<Integer> set = Collections.synchronizedList(new ArrayList<>());


    @Override
    public void run() {
        if(set.contains(1))
            set.add(2);
        else
            set.add(1);
        log.info("New Thread");
        System.out.println(set);
    }
    public static void main(String[] args) {
        Async multiThread1=new Async();
        Async multiThread2=new Async();
        log.info("*****111***");
        multiThread1.start();
        multiThread2.start();
        log.info("*****222***");
    }

}
