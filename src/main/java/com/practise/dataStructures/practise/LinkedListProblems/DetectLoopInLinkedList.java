package com.practise.dataStructures.practise.LinkedListProblems;

import java.util.ArrayList;
import java.util.List;

public class DetectLoopInLinkedList<T> {

    public static <T> boolean detectLoop(LinkedListBasicOperations<T> list) {
        List<T> input = new ArrayList<>();
        LinkedListBasicOperations.Node temp = list.headNode;
        while (temp != null) {
            if(input.contains(temp.data)) {
                return true;
            } else {
                input.add((T) temp.data);
            }
            temp = temp.nextNode;
        }
        return false;
    }

    public static <T> boolean detectLoopFastAndSlowPointers(LinkedListBasicOperations<T> list) {
        LinkedListBasicOperations.Node slow = list.headNode;
        LinkedListBasicOperations.Node fast = list.headNode;

        while (slow != null && fast != null && fast.nextNode != null) {

            slow = slow.nextNode;
            fast = fast.nextNode.nextNode;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }


    public static void main(String [] args) {
        LinkedListBasicOperations<Integer> list = new LinkedListBasicOperations<Integer>();
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.headNode.nextNode.nextNode = list.headNode;
        System.out.println(DetectLoopInLinkedList.detectLoopFastAndSlowPointers(list));

    }
}
