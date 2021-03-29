package com.holdingObjects;

import java.util.*;

public class QueueDemo {
    public static void printQ(Queue queue){
        while(queue.peek() != null){
            System.out.print(queue.remove()+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);
        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i+10));
        }
        // offer will insert element at the tail of the queue
        // remove will return element from the head of the queue
        printQ(queue);

        //priority queue
        Queue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            pq.offer(random.nextInt(i+10));
        }
        printQ(pq);

        pq = new PriorityQueue<>(10, Collections.reverseOrder());
        pq.addAll(Arrays.asList(1,4,5,3,2,5,5,6,6,11));
        printQ(pq);
    }
}
