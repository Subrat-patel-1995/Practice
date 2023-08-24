package com.example.project1.oops.questions.dsa;

import java.util.Stack;

public class Random {
    public static void main(String[] args) {

    }
    public static int removeDuplicates(int[] nums) {

        int newIndex = 1; // Start with index 1 because the first element is already in place

        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]!=nums[i+1]){
                nums[newIndex]=nums[i+1];
                newIndex++;
            }

        }
        return newIndex; // Return the length of the new subarray
    }
    static boolean checkString(String s){
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray() ){
            if(c=='{')
                stack.push('}');
            else if (c =='[') {
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop()!=c) {
                return false;
            }

        }
        return stack.isEmpty();

    }
    //    prices = [7,1,5,3,6,4]
    public static int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=prices[1]-prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<min){
                min=prices[i];
            }
            if(prices[i]-min>profit){
                profit=prices[i]-min;
            }

        }
        return profit;
    }

    public static int reverseNumber(int num){
        int reverse=0;
        while(num!=0){
            int x=num%10;
            reverse=reverse*10+x;
            num/=10;
        }
        return reverse;
    }
    public int singleNumber(int[] nums) {
        int ans=0; //since XOR with 0 returns same number
        for(int i=0; i<nums.length; i++){
            ans ^= nums[i];  // ans = (ans) XOR (array element at i)
        }
        return ans;
    }
}
