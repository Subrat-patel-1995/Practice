package com.example.project1.oops.questions.dsa;


import java.util.HashMap;
import java.util.HashSet;

public class SlidingWindow {
    public static void main(String[] args) {

    }

    /*Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.



            Example 1:

    Input: nums = [1,2,3,1], k = 3
    Output: true
    Example 2:

    Input: nums = [1,0,1,1], k = 1
    Output: true
    Example 3:

    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false*/
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap();
        for (int i = 0; i < nums.length; i++) {
            Integer prev=map.put(nums[i],i );
            if(prev !=null && i-prev<=k)
                return true;
        }
        return false;

    }
}
