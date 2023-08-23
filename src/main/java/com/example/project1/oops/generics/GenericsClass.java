package com.example.project1.oops.generics;


import java.util.LinkedList;
import java.util.List;

public class GenericsClass {
    public static void main(String[] args) {
        LinkedList name=new LinkedList<>();
        float time1=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            name.add(i);
        }
        float time2=System.currentTimeMillis();
        System.out.println("insertion1 "+(time2-time1));


        float time3=System.currentTimeMillis();

        for (int i = 0; i < name.size()/100; i++) {
            Object j=name.get(i);
        }
        float time4=System.currentTimeMillis();
        System.out.println("Reading1 "+(time4-time3));

    }

}
