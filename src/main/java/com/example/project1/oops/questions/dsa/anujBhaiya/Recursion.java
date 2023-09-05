package com.example.project1.oops.questions.dsa.anujBhaiya;

public class Recursion {
    public static void main(String[] args) {


    }
    //Palindrome
    static boolean isPalindrome(String s,int left,int right){
        if(left>=right)
            return true;
        if(s.charAt(left)!=s.charAt(right))
            return false;
        return isPalindrome(s,left+1,right-1);
    }

    //MAtrix LowestPath
    //f(m,n)
    //-->>f(m-1,n)+f(m,n-1)
    //Base case(m==1 || n==1) return 1;

    //josephus problem

    //PowerSet
    // powerSet("str",0,"");
    static void powerSet(String s,int i ,String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        powerSet(s,i+1,cur+s.charAt(i));
        powerSet(s,i+1,cur);
    }
}
