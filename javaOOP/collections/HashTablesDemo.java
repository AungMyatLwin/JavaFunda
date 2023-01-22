package javaOOP.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTablesDemo {
    /**
     * Map is same as objects in js and dictionary in py
     */
    public static void show(){
        
        var c1=new Customer("a", "e1");
        var c2=new Customer("b", "e2");
        Map<String,Customer > customers= new HashMap<>();
        customers.put(c1.getEmail(), c1);
        customers.put(c2.getEmail(), c2);
        var customer=customers.get("e1");
        System.out.println(customer);
    }
}
