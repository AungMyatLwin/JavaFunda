package javaOOP.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void show(){
        Set<String> set= new HashSet<>();
        set.add("sky");
        set.add("is");
        set.add("blue");
        set.add("blue");
        System.out.println(set);
        Collection<String> collection=new ArrayList<>();
        Collections.addAll(collection, "a","b","c","c");
        Set<String>nSet=new HashSet<>(collection);
        System.out.println(nSet);
        Set<String> set1=new HashSet<>(Arrays.asList("a","v","v","c"));
        Set<String> set2=new HashSet<>(Arrays.asList("b","v","d","c"));
        set1.addAll(set2);
        System.out.println(set1);
    }
}
