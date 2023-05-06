package com.kumarmanoj;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CollectionLinkedList {
    //LinkedList is list just like ArrayList
    // Both implements the List interface and List interface extends the Collection Interface

    public static Integer[] convertArrayListToArray(List<Integer> list) {

        Integer[] res = list.toArray(new Integer[0]);
        return res;
    }
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(12);
        linkedList.add(13);

        System.out.println(linkedList);

        //we can iterate it over using the enhance for(T x: collection)
        //or
        //ListIterator
        ListIterator<Integer> lIterator = linkedList.listIterator();

        System.out.println(lIterator.next());
        System.out.println(lIterator.next());
        System.out.println(lIterator.previous());
    }

}
