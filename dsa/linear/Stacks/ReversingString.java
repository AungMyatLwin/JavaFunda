package dsa.linear.Stacks;

import java.util.Arrays;
import java.util.Stack;

public class ReversingString {
    private int lenght;
    public String args;
    public ReversingString(String args){
        this.args=args;
        this.lenght=args.length();
    }
    public String reverse(){
        Stack<String> str=new Stack<>();
        for(int i=0; i<lenght;i++){
            str.push(args.charAt(i)+"");
        }
        args="";
        for(int i=0;i<lenght;i++){
            
            var cha=str.pop();
            args=args.concat(cha);
        }
        return "new Array :"+args;
    }
}
