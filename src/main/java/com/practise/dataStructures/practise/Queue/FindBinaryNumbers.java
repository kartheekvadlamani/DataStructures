package com.practise.dataStructures.practise.Queue;

public class FindBinaryNumbers {

    public static String[] findBin(int number) {
        String[] result = new String[number];
        QueueBasicOperations<String> queue = new QueueBasicOperations<String>(number + 1);

        queue.enQueue("1");

        for (int i = 0; i < number; i++) {
            result[i] = queue.deQueue();
            String s1 = result[i] + "0";
            String s2 = result[i] + "1";
            queue.enQueue(s1);
            queue.enQueue(s2);
        }

        return result; //For number = 3 , result = {"1","10","11"};
    }

    public static void main(String args[]) {

        String[] output = findBin(3);
        for(int i = 0; i < 3; i++)
            System.out.print(output[i] + " ");
    }

}
