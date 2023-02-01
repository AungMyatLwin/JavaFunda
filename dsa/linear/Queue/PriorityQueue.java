package dsa.linear.Queue;

import java.util.Arrays;

public class PriorityQueue {
    private int size;
    private int[] arr;
    private int count;
    public PriorityQueue(){
        this.size=4;
       this.arr = new int[size];
    }
    //iterate from the end to the beginning
    
    public boolean isFull(){
        return arr.length==count;
    }
    public void resize(int item){
        int[] newArr=new int[count*2];
        for(int i=0; i<count;i++){
            newArr[i]=arr[i];
        }
        arr=newArr;
        arr[count]=item;
    }
   
    public void insert(int item){
        if(isFull())
        {
            resize(item);
        }
        arr[count]=item;
        count++;
        System.out.println(Arrays.toString(arr));
    }
}
