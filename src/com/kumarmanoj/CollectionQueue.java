package com.kumarmanoj;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CollectionQueue {
    public static void main(String[] args) {

        // FIFO Queue
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        // this will return the first element enter the queue, but will not remove the element
        System.out.println(q.peek());
        //it removes the peek or head of the queue
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.isEmpty());
    }
}
