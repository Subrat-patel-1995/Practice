package com.example.project1.oops.questions;

import com.example.project1.oops.questions.dsa.SubArray;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiQuestion {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Apple");
        hashMap.put(2,"Mango");
        hashMap.put(3,"Apple");
        hashMap.put(4,"Graps");
        hashMap.put(5,"Mango");

        System.out.println("Original HashMap: " + hashMap);

        // Filter the HashMap to keep only the entries with distinct values
        Map<String, Long> collect = hashMap
                .entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.counting()))
                .entrySet().stream()
                .peek(System.out::println)
                .filter(e -> e.getValue() == 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        System.out.println(collect);

    }
}
