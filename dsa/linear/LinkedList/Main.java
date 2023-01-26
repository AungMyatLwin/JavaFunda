package dsa.linear.LinkedList;

public class Main {
    public static void main(String [] args){
      var test= new LinkedListEx();
      System.out.println(test.size());
      test.addLast(10);
      test.addLast(20);
      test.addLast(30);
      System.out.println(test.size());
      test.removeFirst();
      test.removeLast();
      System.out.println(test.indexOf(40));
      System.out.println(test.contains(40));
      System.out.println(test.size());

    }
}
