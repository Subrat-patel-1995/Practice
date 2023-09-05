package com.example.project1.oops.questions.dsa.anujBhaiya;

import java.util.Arrays;

public class Maths {
    public static void main(String[] args) {
        System.out.println(tailZeroNum(30));
    }


  ///Prime numbers
    public static boolean[] seiveOfEristhoscenes(int n){
        boolean[] isprime=new boolean[n+1];
        Arrays.fill(isprime,true);
        isprime[0]=false;
        isprime[1]=false;
        for (int i = 2; i *i<n ; i++) {
            for (int j = 2*i; j < n; j+=i) {
                isprime[j]=false;

            }

        }
        return isprime;
    }

    //TailingZeroes
    static int tailZeroNum(int num){
        int count=0;
        for (int i = 5; i <= num; i*=5) {
            count+=num/i;
        }
        return count;
    }

    //gcd
    static int gcd(int a,int b){
        return (a%b)==0?b:gcd(b,a%b);
    }

    //power
    static int firstPower(int a,int b){
        int result=1;
        while ((b>0)){
            if((b & 1)!=0) {
                result *= a;
            }
            a=a*a;
            b=b>>1;//b=b/2
        }
        return result;
    }

}
