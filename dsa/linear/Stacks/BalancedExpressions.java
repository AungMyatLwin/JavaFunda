package dsa.linear.Stacks;

import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.List;
import java.util.Stack;

public class BalancedExpressions {
    public String str;
    private Stack<Character> stack=new Stack<>();
    private final List<Character>leftBrackets=Arrays.asList('(','<','[','{');
    private final List<Character> rightBrackets=Arrays.asList(')','>',']','}');
    public BalancedExpressions(String str){
        this.str=str;
    }
    private boolean isLeftBracket(char ch){
        
        return leftBrackets.contains(ch);
    }
    private boolean isRightBracket(char ch){
        return rightBrackets.contains(ch);
    }
    private boolean bracketsMatch(char left, char right){
        System.out.println(rightBrackets.indexOf(right)==leftBrackets.indexOf(left) );
        return rightBrackets.indexOf(right)==leftBrackets.indexOf(left);
    }
    public boolean isBalanced(){
        for(char a: str.toCharArray()){
            if(isLeftBracket(a)){
                stack.push(a);
            }
            if(isRightBracket(a)) {
                if(stack.isEmpty()) throw new EmptyStackException();
                
                var top=stack.pop();
                if(bracketsMatch(top, a)) return true;
            }
        }
        return stack.isEmpty();
    }
    
}
