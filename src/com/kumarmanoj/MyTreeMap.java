package com.kumarmanoj;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> tmap = new TreeMap<>( (a, b) -> {
            System.out.println("Comparator's compare () implementation");
            return b - a;
        }); // change the Natural ordering of sorting on the basis of the key
        tmap.put(1, "riddhi");
        tmap.put(2, "Manoj");
        tmap.put(3, "kumar");
//        tmap.remove(2);

        // Put and remove method will take the logn time

        Set<Map.Entry<Integer, String>> entrySet=  tmap.entrySet();

        // Tree Map are sorted according to Natural ordering of the Integer class
        for(Map.Entry<Integer, String> entry : entrySet) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // closest matches
        System.out.println(tmap.ceilingKey(2)); // greatest key value <= passed key

        System.out.println(tmap.floorEntry(2));
    }
}
