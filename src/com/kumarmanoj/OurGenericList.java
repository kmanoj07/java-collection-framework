package com.kumarmanoj;

import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> { // At the compile time this T replace by the data type, generic
    private T[] items;
    private int size;
    public OurGenericList(){
        size = 0;
        this.items = (T[]) new Object[100];
    }
    public void add(T item){
        items[size] = item;
        size++;
    }
    public T getItemAtIndex(int index) {
        return items[index];
    }

    public int size() {
        return size;
    }

    @Override
    public Iterator<T> iterator(){
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> {
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list){
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            System.out.println("has next called");
            return (index < list.size());
        }

        @Override
        public T next() {
            System.out.println("next called");
            return list.items[index++];
        }
    }
}
