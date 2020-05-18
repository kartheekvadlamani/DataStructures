package com.practise.dataStructures.practise.Stack;

public class StackBasicOperations<T> {

    private int top;
    private T[] array;
    private int maxSize;

    @SuppressWarnings("unchecked")
    public StackBasicOperations(int maxSize) {
        this.maxSize = maxSize;
        this.top = -1;
        array = (T[]) new Object[maxSize];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public void push(T data) {
        if (isFull()) {
            System.out.println("Stack Over flow Exception");
            return;
        }
        array[++top] = data;
    }

    public T top() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow Exception");
            return null;
        }
        return array[top--];
    }

    public int getMaxSize() {
        return maxSize;
    }
}
