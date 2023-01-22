package javaOOP.generics;

import javax.jws.soap.SOAPBinding.Use;

public class Utils {
    public static int maxN(int first, int second){
        return(first>second)? first:second;
    }
    public static <T extends Comparable<T>> T maxT(T first, T second){
        return(first.compareTo(second)<0)? first:second;
    }
    public static <K,V> void print( K key , V values){
        System.out.println(key+"+"+values);
    }
    public static void printUser(User user)
    {
        System.out.println(user);
    }

    public static void printUsers(GenericList<? extends User> users){
        User x=users.get(0);
    }
}
