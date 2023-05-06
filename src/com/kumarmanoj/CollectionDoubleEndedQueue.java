package com.kumarmanoj;

import java.util.ArrayDeque;

public class CollectionDoubleEndedQueue {
    public static void main(String[] args) {
        // Double Ended Queue
        ArrayDeque<Integer> dq = new ArrayDeque<>();
//        - LIFO - Stack behaviour from ArrayDeque
//        dq.offerFirst(1);
//        dq.offerFirst(2);
//        System.out.println(dq);
//        System.out.println(dq.peekFirst());
//        //remove element
//        dq.pollFirst();
//        System.out.println(dq);

//        FIFO - normal Queue behaviour of the ArrayDeque
        dq.offerLast(1);
        dq.offerLast(2);
        dq.offerLast(3);

        System.out.println(dq.peekFirst());
        System.out.println(dq.pollFirst());

        System.out.println(dq.peekFirst());
        System.out.println(dq.pollFirst());
    }
}
