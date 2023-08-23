package com.example.project1.oops.questions.dsa;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(findSecondLargest(new int[]{1,2,11,3,4,11,5}));
    }
        static int findSecondLargest(int[] arr){
            int largest=0;
            int secondLargest=0;

            for (var i:arr) {
            if(i>largest){
                secondLargest=largest;
                largest=i;
            }else if(i>secondLargest && i!=largest) {
                secondLargest=i;
            }

        }
        return secondLargest;
    }
}
