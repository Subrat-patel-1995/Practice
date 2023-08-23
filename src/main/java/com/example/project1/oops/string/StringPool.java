package com.example.project1.oops.string;

import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class StringPool {
    public static void main(String[] args) {
        longestPalindrome("aabbccbdd");

    }
    public  static void longestPalindrome(String s) {

        int[] count = new int[128];
        char c='c';
        System.out.println(count[c]++);
    }

}
interface A{
    static int a=3;
    void name();
}
