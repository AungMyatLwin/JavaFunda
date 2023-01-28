package dsa.linear.Queue;
import java.util.Arrays;

public class ArrayQueue {
    private int [] array;
    private int count=0;
    private int firstIndex=0;
    public ArrayQueue(int size){
        array=new int[size];
    }
    public void enque(int item){
        if(array.length== count){
            int [] newArray=new int[count*2];
            for(int i=0;i<count;i++){
                newArray[i]=array[i];
            }   
            array=newArray;
        }
        array[count++]=item;
       System.out.println( Arrays.toString(array));
    }
    // deque
    public int deque(){
        if(count==0) return 0;
        if(firstIndex>array.length) return 0;
        int firstIndexItem=array[firstIndex++];
        int [] newArray= new int[count];
        for(int i=firstIndex;i<count;i++)
        {
        newArray[i-firstIndex]=array[i];
        }
        array=newArray;
        count--;
        firstIndex = 0;
        return firstIndexItem;
    }
    // peek
    public int peek(){
        return array.length;
    }
    // isEmpty
    public boolean isEmpty(){
        return array.length==0;
    }
    // isFull
    public boolean isFull(){
        return array.length>count;
    }
}
