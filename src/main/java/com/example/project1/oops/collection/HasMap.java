package com.example.project1.oops.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HasMap {
    public static void main(String[] args) {
        var map=new HashMap<Integer,String>();
        map.put(1,"1");
        map.put(1,"11");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");
        System.out.println(map);
        //This gives ConcurrentModificationException

        /*
        map.forEach((k,v)-> {
                    if (k .equals(2)){
                        //map.remove(2);
                    }
            System.out.println(k +"  ->  " +v);


                });*/

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
//            Map.Entry<Integer, String> entry = iterator.next();
            if (iterator.next().getKey() == 2) {
                iterator.remove(); // Remove the current entry
            }
        }

        System.out.println(map); // Output: {1=One, 3=Three}

    }
}
