package com.example.project1.oops.java8features.stramApi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> list=List.of(1,2,3,4,5,4,5,6);
        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy((i) -> i, Collectors.counting()));
        System.out.println(collect);
    }
}
