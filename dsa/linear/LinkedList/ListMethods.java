package dsa.linear.LinkedList;

import java.util.LinkedList;

public class ListMethods {
    public static void builtInMethods(){
        LinkedList<Integer> list = new LinkedList<>();
        list.addLast(19);
        list.addLast(20);
        list.addFirst(45);
        list.removeFirst();
        list.removeLast();
        list.contains(20);
        list.indexOf(20);
        list.size();
        list.toArray();
        System.out.println(list);
        list.removeAll(list);
    }
}
