package javaOOP.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// import javaOOP.generics.GenericList;
import javaOOP.collections.CollectionsDemo;
import javaOOP.collections.ListDemo;
import javaOOP.collections.Customer;
import javaOOP.collections.QueueDemo;


public class Main {
 public static void main(String[] args) {
        CollectionsDemo.show();
        ListDemo.show();
        List<Customer>customers= new ArrayList<>();
        customers.add(new Customer("e","e3"));
        customers.add(new Customer("c","e2"));
        // compilation error Collections.sort(customers);
        Collections.sort(customers,new EmailComparator());
        System.out.println(customers
        );
        QueueDemo.show();
        SetDemo.show();
        HashTablesDemo.show();
        
    }
}
