package com.example.project1.oops.questions.dsa.twopointers;

import java.util.Arrays;

public class RemoveDulipcates {
    public static void main(String[] args) {
        int i = removeDup(new int[]{3} ,2);
        System.out.println(i);

    }

    // This is the first level
//    Input: nums = [0,1,2,2,3,0,4,2]
    static int removeDup(int[] arr){
        int newIndex=1;
        for (int index = 0; index < arr.length-1; index++) {
            if(arr[index]!=arr[index+1]){
                arr[newIndex]=arr[index+1];
                newIndex++;
            }
            System.out.println(Arrays.toString(arr));
        }
        return newIndex;
    }

    // This is the second level

//    Input: nums = [0,1,2,2,3,0,4,2], val = 2
//    Output: 5, nums = [0,1,4,0,3,_,_,_]
//    Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//    Note that the five elements can be returned in any order.
//    It does not matter what you leave beyond the returned k (hence they are underscores).

    static  int removeDup(int[] arr , int val) {
        int newIndex = 0;
        for (var num:arr){
            if(val!=num){
                arr[newIndex]=num;
                newIndex++;
            }
        }
        return newIndex;
    }
}
