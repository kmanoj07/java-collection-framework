package com.kumarmanoj;

import java.util.Arrays;
import java.util.Comparator;

public class Dog implements Comparable<Dog> {
    private int id;
    private String name;
    private int age;

    public Dog(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Dog dog){
        //My Dog objects will sort them descending oreder
        //recently added object order
        return -(this.age - dog.age);
    }

    public static Comparator<Dog> nameComparator = new Comparator<Dog>() {
        @Override
        public int compare(Dog o1, Dog o2) {
            if(o1.name.compareTo(o2.name) == 0) {
                return  0;
            } else if(o1.name.compareTo(o2.name) > 0){
                return 1;
            }
            return -1;
        }
    };


    @Override
    public String toString() {
        return "Dog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog(1, "bruno",10 );
        dogs[1] = new Dog(4, "Dash",1 );
        dogs[2] = new Dog(3, "Bash",13 );
        dogs[3] = new Dog(2, "Tiger",12 );
        dogs[4] = new Dog(0, "Shera",20 );

        //This sort will not work as it will through ClassCastException -
        //We have to decide the natural ordering of our objects
        //So that they can compare themselves using Comparable interface
//        Arrays.sort(dogs);

        //We can define the custom camparator to sort the object apart from natural ordering
        Arrays.sort(dogs, Dog.nameComparator);
        System.out.println(Arrays.toString(dogs));
    }
}
