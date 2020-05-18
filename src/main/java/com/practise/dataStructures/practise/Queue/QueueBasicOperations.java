package com.practise.dataStructures.practise.Queue;


public class QueueBasicOperations<T> {

    private int front;
    private int back;
    private T[] array;
    private int maxSize;
    private int currentSize;

    public QueueBasicOperations(int maxSize) {
        this.maxSize = maxSize;
        this.front = 0;
        this.back = -1;
        this.array = (T[]) new Object[maxSize];
        this.currentSize = 0;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void enQueue(T data) {
        if (isFull()) {
           System.out.println("Queue is full, Cant insert an element");
            return;
        }
        array[++back] = data;
        currentSize++;
    }

    public T deQueue() {
        if (isEmpty()) {
            return null;
        }
        T temp = array[front++];
        currentSize--;
        return temp;
    }

    public T top() {
        return array[currentSize];
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }
}
