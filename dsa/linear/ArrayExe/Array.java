package dsa.linear.ArrayExe;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Array {
    private int count;
    private int[] items;
    
    // constructor
    public Array(int indexCount){
        this.items=new int[indexCount];
    }
    public void print(){
        for(int element: items)
        {
            System.out.println(element);
        }
    }
    public void insert(int element){
        if(items.length==count){
            int [] newItems=new int[count*2];
            for(int i=0;i<count;i++){
                newItems[i]=items[i];
            }
            // important part
            items=newItems;
        }
        items[count++]=element;
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
    // easy
    public int indexOf(int item){
        for(int i=0;i<count;i++){
            if(items[i]==item)
            {
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
    public  void reverse(){
        for(int i=count;i>=0;i--){
            System.out.println(items[i]);
        }
    }
    public void insertAt(int element, int index){
        if(index>count){
            throw new IllegalArgumentException();
        }
        else{
            items[index]=element;
        }
        Arrays.stream(items).forEach(t->System.out.println(t));
    }
}
