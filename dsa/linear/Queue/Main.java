package dsa.linear.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        // Queue<Integer> q= new ArrayDeque<>();
        // q.add(19);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // // var removed=q.remove();
        // Main.reverse(q);
    //     var arrQue=new ArrayQueue(2);
    //     arrQue.enque(1);
    //     arrQue.enque(2);
    //     arrQue.enque(3);
    //     var s=arrQue.deque();
    //     System.out.println(s);
    //     var ss=arrQue.deque();
    //     System.out.println(ss);
    //     var i=arrQue.deque();
    //    System.out.println( arrQue.deque());
    //     System.out.println(i);
     StackQueue stackQueue= new StackQueue();
     stackQueue.enque(10);
     stackQueue.enque(20);
     stackQueue.enque(30);
     System.out.println(stackQueue.peek());
     stackQueue.deque();
     System.out.println(stackQueue.peek());
        
    }
    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack=new Stack<>();
        while(!queue.isEmpty()){
            stack.push(queue.remove());
        }
        while(!stack.empty()){
        queue.add(stack.pop());
       }
        System.out.println(queue.toString()+""+stack.toString());
    }
}
