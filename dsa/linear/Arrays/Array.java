package dsa.linear.Arrays;

import java.util.Arrays;

public class Array {
    public static int[] numbers=new int[3];
    public static int[] numbers2={10, 20, 30};
    public static void show(){
        Array.numbers[0]=10;
        System.out.println(Arrays.toString(Array.numbers));
    }
    public static int len(){
        return Array.numbers.length;
    }
    public static void exerciseOne(){
        // Array numbers = new Array(3);
        // numbers.insert
    }
}
