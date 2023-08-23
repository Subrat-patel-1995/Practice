package com.example.project1.oops.questions.dsa;

import java.util.HashMap;

public class SubArray {
    public static void main(String[] args) {
        System.out.println(subArray(new int[] {1,2,3,6,7,8,4,5,9},10));
    }
    static String subArray(int[] arr, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(target-i)){
                stringBuilder.append("[")
                        .append(i)
                        .append(",")
                        .append(target-i)
                        .append("]");
            }
            map.put(i,i);
        }
        return stringBuilder.toString();
    }

}

