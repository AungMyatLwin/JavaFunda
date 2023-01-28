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
        stackTemp=stackInput.lastElement();
        for(int i=stackInput.size()-1;i>=0;i--){
           stackExchange.push(stackInput.elementAt(i));
        }
       stackInput=stackExchange;
      return stackInput.pop();
    }
    public String peek(){
        return stackInput.toString();
    }
}
