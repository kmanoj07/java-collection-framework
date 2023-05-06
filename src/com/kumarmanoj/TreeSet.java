package com.kumarmanoj;

import java.util.*;

public class TreeSet {
    public static void main(String[] args) {
//        Set<StudentMarks> treeset = new java.util.TreeSet<>();
//
//        //since it is a SoretedSet
//        // Comparator -
//        treeset.add(new StudentMarks(70,80));
//        treeset.add(new StudentMarks(38,20));
//        treeset.add(new StudentMarks(100, 39));
//        treeset.add(new StudentMarks(40, 88));
//        treeset.add(new StudentMarks(97, 19));
//
//        //currently the sorting order is on maths marks descending
//
//        for(StudentMarks marks: treeset){
//            System.out.println(marks); // getting the student marks Comparable's CompareTo(Object o) - natural ordering
//        }

        //lets we want our own sorting order total ordering
        Set<StudentMarks> treeset = new java.util.TreeSet<>(StudentMarks.physicsComparator);

        //since it is a SoretedSet
        // Comparator -
        treeset.add(new StudentMarks(70,80));
        treeset.add(new StudentMarks(38,20));
        treeset.add(new StudentMarks(100, 39));
        treeset.add(new StudentMarks(40, 88));
        treeset.add(new StudentMarks(97, 19));

        //currently the sorting order is on physics marks descending order

        for(StudentMarks marks: treeset){
            System.out.println(marks); // getting the student marks Comparable CompareTo(Object o) - natural ordering
        }

        //SortedSet - it will sort the set and maintained the order
        NavigableSet<Integer> intSet = new java.util.TreeSet<>(); // Natural ordering will follow here because the Integer wrapper class implements the comparable
        intSet.add(8);
        intSet.add(3);

        intSet.add(1);
        intSet.add(0);

        //Asc order sorted -- Natural ordering of the Integer class - implementation of the Comparable
        for(int x: intSet){
            System.out.println(x);
        }

        //finding the floor of passed element
        System.out.println(intSet.floor(2)); // greatest elem <= object e passed
        System.out.println(intSet.higher(1)); // Strictly greater ele than object e
        System.out.println(intSet.lower(1)); // strictly lower elem then Object e

        System.out.println(intSet.ceiling(2)); // Least element >= Object e

    }
}
