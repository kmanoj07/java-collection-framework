package com.kumarmanoj;

import java.util.*;

public class MySet {
    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<Integer>();
        alist.add(1);
        alist.add(2);;
        alist.add(3);
        alist.add(3);
        alist.add(2);
        Set<Integer> set = new HashSet<>(alist);
//        set.remove(2);
        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(5);
        set2.add(6);

        System.out.println(set);
        System.out.println(set2);

        //intersection
//        System.out.println("After retaining");
//        set.retainAll(set2);
//        System.out.println(set);
//        System.out.println(set2);

//        System.out.println("After removeAll");
//        set.removeAll(set2);
//        System.out.println(set);
//        System.out.println(set2);
//        //System.out.println();

//        set.addAll(set2);
//        System.out.println(set);
//        System.out.println(set2);

//        for(int x: set2){
//            System.out.println(x); // no ordering and no sort
//        }

//        Set<Integer> lhs = new LinkedHashSet<>();
//        lhs.add(2);
//        lhs.add(5);
//        lhs.add(6);

        List<StudentMarks> stmk = new ArrayList<>();
        stmk.add(new StudentMarks(70, 90));
        stmk.add(new StudentMarks(86, 65));
        stmk.add(new StudentMarks(35, 88));
        stmk.add(new StudentMarks(88, 89));
        stmk.add(new StudentMarks(70, 90)); // This will be not added

        Set<StudentMarks> setMarks = new HashSet<>(stmk);
        //Ideally this should return true but res : false
        System.out.println(setMarks.contains(new StudentMarks(70, 90)));
        for(StudentMarks x: setMarks){
            System.out.println(x); // no ordering and no sort
        }
    }
}
