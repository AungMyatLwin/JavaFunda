package javaOOP.exceptions;

public class ExceptionsDemo {
    public static void show(){
        sayHello(null);
    }
    public static void sayHello(String name)
    {
        System.out.print(name.toUpperCase());
    }
    public static void main(String [] args)
    {
        ExceptionsDemo.show();
    }
}
