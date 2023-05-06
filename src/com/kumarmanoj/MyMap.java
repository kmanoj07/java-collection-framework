package com.kumarmanoj;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyMap {

    public static void main(String[] args) {
        Map<String, StudentMarks> map = new HashMap<>();
        map.put("riddhi", new StudentMarks(90, 100));
        map.put("raj", new StudentMarks(100, 87));

//        System.out.println(map.get("f").getMaths()); // NullPointerException
        // To avoid Exception use map.getOrDefault( "key", default value)
//        System.out.println(map.getOrDefault("dfdf", new StudentMarks(76, 56)));
//        System.out.println(map.getOrDefault("raj", new StudentMarks(89, 45)));

        //to check the key exist
//        System.out.println(map.containsKey("riddhi")); // if yes - true
//
//        StudentMarks studentMarks= map.remove("raj"); //returning the previous value that has been removed
//
//        System.out.println(studentMarks);


        //Adjacent nodes -- list of Node numbers in a tree which is adjacent to particular node
        //Map<Integer, List<Integer>> adj = new HashMap<>(); // list of adjacent node to the current


        // Traversing a map
        // map is not a collection - we need to convert it to set
        // 3 way a map can be converted into set
        // Map.Entry<K, V> --
        // O values(); -- list
        // keySet
        Set<Map.Entry<String, StudentMarks>> entrySet = map.entrySet(); // it will retrun the set of the entreis
//        for(Map.Entry<String, StudentMarks> entry : entrySet){
//            System.out.println(entry.getKey() + " " + entry.getValue().toString());
//        }

        // keySet
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(  key + " " + map.get(key).toString());
        }

        // values - Collection  - List
        List<StudentMarks> students = (List<StudentMarks>) map.values(); // Collection<v> -- than classCastException
//        for(StudentMarks student: students){
//            System.out.println(student.toString());
//        }
    }
}
