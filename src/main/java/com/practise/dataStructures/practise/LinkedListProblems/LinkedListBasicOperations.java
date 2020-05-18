package com.practise.dataStructures.practise.LinkedListProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LinkedListBasicOperations<T> {

    public static void main(String [] args) {
        LinkedListBasicOperations<String> list = new LinkedListBasicOperations<String>();
        list.insertAtEnd("This");
        list.insertAtEnd("list");
        list.insertAtEnd("is");
        list.insertAtEnd("Generic");
        list.printAll();
        System.out.println("length of linkedList :"  + list.length());
    }

    public class Node<T> {
        public T data;
        public Node<T> nextNode;
    }

    public Node headNode;
    public int size;

    public LinkedListBasicOperations() {
        headNode = null;
        size = 0;
    }

    public boolean isEmpty() {
        if (headNode == null)
            return true;
        return false;
    }

    public void insertAtHead(T data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = headNode;
        headNode = newNode;
        size++;
    }

    public void insertAtEnd(T data) {
        if (isEmpty()) {
            insertAtHead(data);
            return;
        }

        Node newNode = new Node();
        newNode.data = data;
        newNode.nextNode = null;

        Node temp = this.headNode;
        while(temp.nextNode != null) {
            temp = temp.nextNode;
        }
        temp.nextNode = newNode;
        size++;
    }

    public void insertAfter(T prev, T data) {
        Node newNode = new Node();
        newNode.data = data;

        Node currentNode = this.headNode;
        while (currentNode != null  && !currentNode.data.equals(prev)) {
            currentNode = currentNode.nextNode;
        }

            if(currentNode.data == prev) {
                newNode.nextNode = currentNode.nextNode;
                currentNode.nextNode = newNode;
                size++;
            }
    }

    public boolean search(T data) {
        if (isEmpty())
            return false;
        Node<T> temp = this.headNode;
        while(temp != null) {
            if (temp.data == data) {
                return true;
            }
            temp = temp.nextNode;
        }
        return false;
    }

    public void deleteAtEnd(T data) {
        if (isEmpty())
            return;
        Node currentNode = this.headNode;
        Node prevNode = null;
        while (currentNode != null) {
            if (currentNode.data == data) {
                prevNode.nextNode = null;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
        size--;
    }

    public void deleteAtHead() {
        if(isEmpty())
            return;
        headNode = headNode.nextNode;
        size--;
    }

    public void deleteByValue(T data) {
        //if empty then simply return
        if (isEmpty())
            return;

        //Start from head node
        Node currentNode = this.headNode;
        Node prevNode = null; //previous node starts from null

        if (currentNode.data.equals(data)) {
            //data is at head so delete from head
            deleteAtHead();
            return;
        }
        //traverse the list searching for the data to delete
        while (currentNode != null) {
            //node to delete is found
            if (data.equals(currentNode.data)) {
                prevNode.nextNode = currentNode.nextNode;
                return;
            }
            prevNode = currentNode;
            currentNode = currentNode.nextNode;
        }
    }

    public void printAll() {
        Node<T> temp = this.headNode;
        if(isEmpty()) {
            System.out.println("Given linkedList is : -------> Null");
            return;
        }

        while (temp.nextNode != null) {
            System.out.println("Given linkedList is : " + " " + temp.data.toString());
            temp = temp.nextNode;
        }
        System.out.println(temp.data.toString() + " -> null");
    }

    public int length() {
        int count = 0;
        Node<T> temp = headNode;
        while(temp != null) {
            temp = temp.nextNode;
            count++;
        }
        return count;
    }

}
