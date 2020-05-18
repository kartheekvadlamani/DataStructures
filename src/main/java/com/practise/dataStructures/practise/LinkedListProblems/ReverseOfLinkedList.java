package com.practise.dataStructures.practise.LinkedListProblems;

public class ReverseOfLinkedList<T> {

    //Need to be reviewed.
    public static<T> void reverse(LinkedListBasicOperations<T> list) {
        LinkedListBasicOperations.Node prev = null;
        LinkedListBasicOperations.Node next = null;

        LinkedListBasicOperations.Node currentNode = list.headNode;

        while(currentNode != null) {
               next = currentNode.nextNode;
               currentNode.nextNode = prev;
               prev = currentNode;
               currentNode = next;
        }
            list.headNode = prev;
    }
}
