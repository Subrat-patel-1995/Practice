package com.example.project1.oops.questions.dsa;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcbda"));

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

    public static int lengthOfLongestSubstring1(String s) {
        int maxLength=0;
        HashSet<Character> set=new HashSet();
        int firstPointer=0;
        for (int secondPointer = 0; secondPointer < s.length(); secondPointer++) {

            if(set.add(s.charAt(secondPointer))){
                maxLength=Math.max(maxLength,secondPointer-firstPointer+1);
            }else {
                while (set.contains(s.charAt(secondPointer))){
                    set.remove(s.charAt(firstPointer));
                    firstPointer++;
                }
                set.add(s.charAt(secondPointer));

            }
        }
        return maxLength;

    } public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }

}
