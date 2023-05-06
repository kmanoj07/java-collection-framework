package com.kumarmanoj;

import java.util.Comparator;
import java.util.Objects;

public class StudentMarks implements Comparable<StudentMarks> {
    private int maths;
    private int physics;

    public StudentMarks(int maths, int physics) {
        this.maths = maths;
        this.physics = physics;
    }

    public int getMaths() {
        return maths;
    }

    public void setMaths(int maths) {
        this.maths = maths;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "maths=" + maths +
                ", physics=" + physics +
                '}';
    }


    @Override
    public int compareTo(StudentMarks o) {
        /*
         current Object < other Object
            return -1;

         current Object > other Object
            return 1;

         current Object == other Object
           return 0
         */
        System.out.println("Comparable compareTo(Student s) is called"); // Natural ordering
        return -(this.maths - o.maths); // ascending order comparison

    }

    //custom comparators
    public static Comparator<StudentMarks> physicsComparator = new Comparator<StudentMarks>() {
        @Override
        public int compare(StudentMarks o1, StudentMarks o2) {
            return -(o1.physics - o2.physics);
        }
    };

    @Override
    public boolean equals(Object o) {
        if (this== o) return true; //references same objects are equals
        if (o == null || getClass() != o.getClass()) return false; //if the o and the current instance are belongs to different type return false
        StudentMarks that = (StudentMarks) o; //cast the object to Current type
        return maths == that.maths && physics == that.physics; // check the equality on the field values
    }

    @Override
    public int hashCode() {
        return Objects.hash(maths, physics); // This will generate the hashcode for the object on the bases if the specified field
    }
}
