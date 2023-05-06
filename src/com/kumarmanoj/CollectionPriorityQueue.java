package com.kumarmanoj;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class CollectionPriorityQueue  {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(1);
        pq.offer(2);
        pq.offer(0);
        pq.offer(100);

        //top 2 elements
//        List<Integer> top2 = new ArrayList<>();
//        int index = 0;
//        while(!pq.isEmpty()) {
//            if(index == 2){
//                break;
//            }
//            top2.add(pq.poll());
//            index++;
//        }

//        System.out.println(top2);
//        System.out.println(pq);

        List<StudentMarks> stMarks = new ArrayList<>();
        stMarks.add(new StudentMarks(70, 80));
        stMarks.add(new StudentMarks(60, 90));
        stMarks.add(new StudentMarks(90, 80));
        stMarks.add(new StudentMarks(80, 45));
        stMarks.add(new StudentMarks(65, 80));

        /* get me top 3 students according to their maths marks?*/
//        PriorityQueue<StudentMarks>  prs = new PriorityQueue<>(stMarks);
        //implementing different class that implements Comparator interface and compare(Object o1, Object o2)
//        PriorityQueue<StudentMarks> prs = new PriorityQueue<>(StudentMarks.physicsComparator); // passing the comparator to the Creation of PriorityQueue

        PriorityQueue<StudentMarks> prs = new PriorityQueue<>((s1, s2) -> { // implementation of Compare() method passed here
            System.out.println("Comparator's compare(Student s1, Student s2) is called");
            return -(s1.getPhysics() - s2.getPhysics());
        }); // using lambda function to pass the comparator
        for(StudentMarks marks: stMarks){
            prs.offer(marks);
        }
        // Top 3 StudentMarks object
        List<StudentMarks> top3 = new ArrayList<>();
        int index = 0;
        while(!prs.isEmpty()) {
            if(index == 3){
                break;
            }
            top3.add(prs.poll()); // removing element from pqs to list
            index++;
        }

        System.out.println(top3);
        System.out.println(prs);

    }
}
