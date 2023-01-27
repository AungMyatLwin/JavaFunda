package dsa.linear.Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        Queue<Integer> q= new ArrayDeque<>();
        q.add(19);
        q.add(20);
        q.add(30);
        q.add(40);
        // var removed=q.remove();
        Main.reverse(q);
        
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
