package com.practise.dataStructures.practise.Stack;

import java.util.HashMap;
import java.util.Map;

public class ClassTwoStacks<T> {
    private int maxSize;
    private T[] array;

   private int first;
   private int last;

    @SuppressWarnings("unchecked")
    public ClassTwoStacks(int maxSize) {
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        this.last = maxSize;
        this.first = -1;
    }

    public ClassTwoStacks() {

    }

    public void push1(T data) {
        if (first < last - 1) {
            array[++first] = data;
        }
    }

    //insert at top of second stack
    public void push2(T data) {
        if (first < last - 1) {
            array[--last] = data;
        }
    }

    public T pop1() {
        if (first > -1) {
            return array[first--];
        }
        return null;
    }

    //remove and return value from top of second stack
    public T pop2() {
        if (last < maxSize) {
            return array[last++];
        }
        return null;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int [] output = new int[nums2.length];
        int constant = -1;
        Map<Integer, Integer> input = new HashMap<>();
        for (int i =0; i<nums2.length; i++) {
            input.put(nums2[i], i);
        }
        for (int j =0; j<nums1.length; j++) {
            Integer pos = input.get(nums1[j]);
            for (Integer p = pos; p< nums2.length; p++) {
                if (nums2[p] > nums2[pos]) {
                    output[j] = nums2[p];
                    break;
                } else {
                    output[j] = -1;
                }
            }
        }
        return output;
    }

    public static void main(String [] args) {
        ClassTwoStacks inn = new ClassTwoStacks();
   //     inn.nextGreaterElement();
    }
}
