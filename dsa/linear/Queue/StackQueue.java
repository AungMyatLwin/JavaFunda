package dsa.linear.Queue;

import java.util.PriorityQueue;
import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stackInput;
    private Stack<Integer> stackExchange;
    private int stackTemp=0;
    public static void priorityQueue(){
        PriorityQueue<Integer> queue=new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);
        while(!queue.isEmpty())
        {
            System.out.println(queue.remove());
        }
    }
    public StackQueue(){
        stackInput= new Stack<>();
        stackExchange= new Stack<>();
    }
    public void enque(int item){
        stackInput.push(item);
       
    }
    public int deque(){
        if(stackExchange.isEmpty()){
            while(!stackInput.isEmpty()){
                stackExchange.push(stackInput.pop());
            }
        }
        return stackExchange.pop();
    }
    
    public Integer peek(){
        return stackInput.peek();
    }
    
}
