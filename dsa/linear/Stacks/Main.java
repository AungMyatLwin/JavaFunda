package dsa.linear.Stacks;

// import java.util.Stack;

public class Main {
    public static void main(String [] args){
        // var stack= new Stack();

        // java.util.Stack<Integer> stacks=new Stack<>();
        // stacks.push(30);
        // stacks.push(10);
        // stacks.push(30);
        // // var top = stacks.pop();
        // // System.out.println(top);
        // // stacks.empty();
        // System.out.println(stacks.peek());
        // reversing string
        // String str="abcd";
        // var rs=new ReversingString(str);
        // System.out.println(rs.reverse());
        // // balanced string
        // var isBalancedString=new BalancedExpressions("(1+");
        // System.out.println(isBalancedString.isBalanced());;
        // stack implementation
        var stack = new Stack();
        var stack2=new Stack();
        stack.push(1);

        stack2.push(10);
        stack2.push(2);
        stack.push(2);
        stack.push(3);
        stack.push(3);
        System.out.println("mini"+ stack.min());
        System.out.println("stack2"+stack2.peek());
        // stack.push(1);
        var top=stack.pop();
        System.out.println("-----------"+top);
        var nextTop=stack.pop();
        System.out.println("ff"+stack.peek());
        System.out.println("-----------"+nextTop);
        System.out.println(stack.pop());
        System.out.println("ff"+stack.peek());
        System.out.println(stack.pop());
        System.out.println("mini"+ stack.min());
        System.out.println("ff"+stack.peek());
        System.out.println(stack.pop());
        
        // System.out.println(top+" "+nextTop);
        
        System.out.println(stack.isEmpty());
        System.out.println("ff"+stack.peek());
    }
}
