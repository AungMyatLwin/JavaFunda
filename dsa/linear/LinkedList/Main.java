package dsa.linear.LinkedList;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
      var test= new LinkedListEx();
      System.out.println(test.size());
      test.addLast(10);
      test.addLast(20);
      test.addLast(30);
      
      // System.out.println(test.size());
      // System.out.println(Arrays.toString(array));
      // test.removeFirst();
      // test.removeLast();
      // System.out.println(test.indexOf(40));
      // System.out.println(test.contains(40));
      // System.out.println(test.size());
      // test.reverse();
      System.out.println(test.getKthFromTheEnd(3));
      var array=test.toArray();
      System.out.println(Arrays.toString(array));
    }
}
