package com.kumarmanoj;

import java.util.*;

public class MyList {

    public static void main(String[] args) {
        List<Integer> alist = new ArrayList<>();
        for(int i=0; i<=10; i++){
            alist.add(i);
        }
        alist.add(11);
        alist.add(2, 23);
        alist.set(1, 90);

        int size = alist.size();
        System.out.println(size);
        System.out.println(alist);

        //copy the previous list
        List<Integer> copyList = new ArrayList<>(alist);
        System.out.println(copyList);
        //sort
        Collections.sort(alist);
        System.out.println(alist);
//        Iterator<Integer> it = alist.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
        for(int x: alist){ // Unboxing reference type - primitive type
            System.out.println(x);
        }

        List<Integer> list2 = new ArrayList<>();
        list2.add(12);
        list2.add(12);
        list2.add(14);
        list2.add(15);
        list2.add(12);
        list2.add(15);

        list2.addAll(alist);
        System.out.println(list2);
        //to get the index of particular object inside the list
        System.out.println(list2.indexOf(2));

        //if there is duplicate element in the list - get the last index of that element
        int lastOcurIndex = list2.lastIndexOf(15);
        System.out.println(lastOcurIndex);

        //slicing the array
        List<Integer> sublist = list2.subList(0,2); // it just return the view of the part of the original array
        // It still references the same original array
        System.out.println(sublist);
        sublist.set(1, 100);
        System.out.println(sublist);
        System.out.println(list2);
    }
}
