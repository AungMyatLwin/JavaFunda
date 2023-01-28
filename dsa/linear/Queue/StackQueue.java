package dsa.linear.Queue;

import java.util.Stack;

public class StackQueue {
    private Stack<Integer> stackInput;
    private Stack<Integer> stackExchange;
    private int stackTemp=0;
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
