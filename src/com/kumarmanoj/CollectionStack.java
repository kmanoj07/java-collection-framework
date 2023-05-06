package com.kumarmanoj;

import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        //Implement the stack (LIFO)
        Stack<Integer> s = new Stack<>();
        //to push the element to stack - add operation
        s.push(10);
        s.push(12);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            System.out.println(s.pop());
        }

        System.out.println(s.isEmpty());

    }
}
