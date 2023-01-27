package dsa.linear.Stacks;
// implement stack using arrays;
public class Stack {
    // with array int[]
    private int [] arrayStack;
    private int length=2;
    private int count=0;
    public Stack(){
    arrayStack=new int[length];       
    }
    public void push(int item){
        if(arrayStack.length==count){
             int[] newArray= new int[count+2];
             for(int i=0; i<count;i++){
                newArray[i]=arrayStack[i];
             }
             arrayStack=newArray;
        }
        arrayStack[count++]=item;
    }
    public int pop(){
        // System.out.println("c: "+(count));
        if(isEmpty()){
            return -1;
        }
        count=count-1;
        int lastElement=arrayStack[count];
        int [] shrink=new int [count];
        for(int i=0; i<count;i++){
            shrink[i]=arrayStack[i];
        }
        arrayStack=shrink;
        return lastElement;
    }
    public boolean isEmpty(){
        System.out.println("arr"+arrayStack.length);
        return(arrayStack.length==0);  
    }
    public int peek(){
        return arrayStack.length;
    }

}
