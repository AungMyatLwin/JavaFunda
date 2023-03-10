package dsa.linear.Arrays;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayExercise{
    private int count;
    private int [] items;
    public ArrayExercise(int length )
    {
        items=new int[length];
    }
    public void print(){
        // for(int i=0;i<count;i++){
        //     System.out.println(items[i]);
        // }
        Arrays.stream(items).forEach(t->System.out.println(t));
    }
    public void insert(int item){
        if(items.length==count){
            int [] newItems=new int[count*2];
            for(int i =0;i<count;i++){
                newItems[i]=items[i];
            }
            items=newItems;
        }
        items[count++]=item;
    }
    public void removeAt(int index){
        if(index<0|| index>=count){
            throw new IllegalArgumentException();
        }
        for(int i=index;i<count;i++){
            items[i]=items[i+1];
        }
        count--;
    }
    public int indexOf(int item){
        for(int i=0;i<count;i++){
            if(items[i]==item){
                return i;
            }
        }
        return -1;
        
    }
    public int max(){
        OptionalInt maxItem=Arrays.stream(items).max();
        System.out.println(maxItem.orElse(0));
        return maxItem.orElse(0);
    }
}