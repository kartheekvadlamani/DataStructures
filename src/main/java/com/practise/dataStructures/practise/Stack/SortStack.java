package com.practise.dataStructures.practise.Stack;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Stack;

public class SortStack {

    public SortStack() {};

    public Stack<Integer> sort(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            Integer value = stack.pop();
            while(!temp.isEmpty() && temp.peek() < value) {
                stack.push(temp.pop());
            }
            temp.push(value);
        }
        return temp;
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
        SortStack sortStack = new SortStack();

        Stack<Integer> tempStack =  sortStack.sort(stack);

        while(!tempStack.isEmpty()){
            System.out.println(tempStack.pop());
        }
    }
}
