package com.example.project1.oops.collection;

import org.apache.catalina.LifecycleState;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class LinkList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList<>();
        list.add("One");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
