package org.example.HomeWorkFour;

import java.util.LinkedList;

public class MyQueue <T>{
    LinkedList<T> queue = new LinkedList<>();

    public void enqueue(T element) {
        queue.addLast(element);
    }
    public T dequeue() {
       T temp =  queue.getFirst();
        queue.removeFirst();
        return temp;
    }
    public T first() {
       return queue.getFirst();
    }


}
