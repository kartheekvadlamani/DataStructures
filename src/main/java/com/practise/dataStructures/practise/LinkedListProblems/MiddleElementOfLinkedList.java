package com.practise.dataStructures.practise.LinkedListProblems;

public class MiddleElementOfLinkedList {

      public static <T> Object findMiddle(LinkedListBasicOperations<T> list) {
          LinkedListBasicOperations.Node  slow = list.headNode;
          LinkedListBasicOperations.Node fast = list.headNode;

          while(slow != null && fast != null && fast.nextNode != null) {
              fast = fast.nextNode.nextNode;

              if (fast != null) {
                  slow = slow.nextNode;
              }
          }
        return slow.data;
      }

      
}
