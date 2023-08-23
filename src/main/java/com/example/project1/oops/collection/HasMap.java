package com.example.project1.oops.collection;

import java.util.HashMap;

public class HasMap {
    public static void main(String[] args) {
        var map=new HashMap<>();
        map.put(1,"1");
        map.put(1,"11");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        System.out.println(map);
    }
}
