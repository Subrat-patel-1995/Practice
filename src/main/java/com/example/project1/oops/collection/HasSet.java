package com.example.project1.oops.collection;

import org.w3c.dom.Node;

import java.util.*;

public class HasSet {

    public static void main(String[] args) {
        HashSet set=new HashSet();
        set.add("Subrat");
        set.add("Subrat1");
        set.add("Subrat2");
        set.add("Subrat3");
        set.add("Subrat4");
        set.add("Subrat5");
        System.out.println(set.add("Subrat"));
        System.out.println(set);
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }




    }
}
