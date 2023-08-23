package com.example.project1.oops.questions.dsa;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getReverseArray(new int[]{1, 2, 3, 4, 5})));

    }
    static int[] getReverseArray(int[] array){
        int firstIndex=0;
        int lastIndex= array.length-1;
        while (firstIndex<lastIndex){
            int newNumber=array[lastIndex];
            array[lastIndex]=array[firstIndex];
            array[firstIndex]=newNumber;
            lastIndex--;
            firstIndex++;
        }
        return array;
    }
}
