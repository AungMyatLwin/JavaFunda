package javaOOP.collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show(){
        Queue<String> queue=new ArrayDeque<>();
        queue.add("c");
        queue.add("q");
        queue.add("b");
        queue.offer("d");
        var front=queue.poll();
        // front is c... d->b->q->c
        System.out.println(queue);

    }
}
