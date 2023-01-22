package javaOOP.generics;

import javax.rmi.CORBA.Util;

import javaOOP.generics.GenericList;
import javaOOP.generics.User;
import javaOOP.generics.Utils;

public class Main {
    public static void main(String [] args){
    var list=new  GenericList <Integer>();
      list.add(1);
    System.out.println(list.get(0));

    var numbers= new GenericList<Integer>();
    numbers.add(1);// boxing
    numbers.get(0);// unboxing
    System.out.println(numbers.get(0));
    
    User user1 = new User(10);
    User user2 = new User(20);
    if(user1.compareTo(user2)<0)
    {
        System.out.println("user1 is smaller than user2");
    }
    else if(user1.compareTo(user2)==0){
        System.out.println("user1 is equal to user2");
        }
    else{
        System.out.println("user1>user2");
    }
   Object max= Utils.maxT( new User(10),  new User(20));
   System.out.println(max.toString());

   Utils.print('b','c');
   User user= new Instructor(10);
   Utils.printUser(user);

//    GenericList users=new GenericList<User>();
    Utils.printUsers(new GenericList<User>());
    }
}
