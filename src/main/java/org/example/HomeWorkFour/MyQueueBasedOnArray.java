package org.example.HomeWorkFour;

public class MyQueueBasedOnArray {
    private int[] array;
    private int capacity;
    private int size;
    public MyQueueBasedOnArray(int size) {
        array = new int[size];
        capacity = size;
        this.size = 0;
    }
    public MyQueueBasedOnArray() {
       new MyQueueBasedOnArray(10);
    }
    public void enqueue(int element) {
        if(size < capacity) {
            array[size] = element;
            size++;
        } else {
            capacity = capacity * 2;
            int[] temp = new int[capacity];
            System.arraycopy(array,0,temp,0,array.length);
            temp[size] = element;
            size++;
            array = temp;
        }
    }
    public int dequeue() {
        int tempElement = array[0];
        int[] tempArray = new int[capacity];
        System.arraycopy(array,1,tempArray,0,size - 1);
        array = tempArray;
        size--;
        return tempElement;
    }
    public int first() {
        return array[0];
    }
    public void print() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("{[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]);
            stringBuilder.append(" ");
        }
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(" "));
        stringBuilder.append("]}");
        System.out.println(stringBuilder.toString());
    }
    public int getSize() {
        return size;
    }

}
