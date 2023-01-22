package javaOOP.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show(){
        Collection<String> collection = new ArrayList<>();
        Collections.addAll(collection, "a","c","b");
        for (String item : collection)
        {
            System.out.println(item);
        }
        var c=collection.size();
        System.out.println(c);
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
        System.out.println(other);
    }
}