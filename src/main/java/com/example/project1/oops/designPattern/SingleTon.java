package com.example.project1.oops.designPattern;

public class  SingleTon{
    private SingleTon(){
    }
    private static SingleTon instance;

    public static SingleTon getSingleTonInstance(){
        if (instance == null) {
            instance= new SingleTon();
        }
        return instance;
    }
}


