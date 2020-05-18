package com.practise.dataStructures.practise.Stack;

import java.util.Stack;

public class QueueUsingAStack<T> {

    private Stack<T> stack;
    private Stack<T> temp;

    public QueueUsingAStack(Stack<T> stack, Stack<T> temp) {
        this.stack = stack;
        this.temp = temp;
    }

    public QueueUsingAStack() {}

    public boolean enqueue(T t) {
        if (stack.size() < stack.capacity()) {
            stack.push(t);
            return true;
        }
            System.out.println("stack is full .... can't insert more values");
            return false;

    }

    public T dequeue(){
        //Traverse stack1 and pop all elements in stack2
        while (!stack.isEmpty()){
            temp.push(stack.pop());
        }
        //pop from stack2 (which was at the end of stack1)
        T result = temp.pop();
        //put all elements back in stack1
        while (!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return result;
    }

    public static void main(String [] args) {
        Stack<String> stack = new Stack<>();

        stack.push("kartheek");
        stack.push("Hemanth");
        stack.push("sailu");

        Stack<String> temp = new Stack<>();

        QueueUsingAStack<String> main = new QueueUsingAStack<String>(stack, temp);

        String result =  main.dequeue();

        System.out.println(result);
        Boolean enQueResult = main.enqueue("sashi");
        System.out.println(enQueResult);

        for (String element : stack) {
            System.out.println(element);
        }
    }
}
