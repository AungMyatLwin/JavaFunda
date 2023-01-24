package javaOOP.lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

// import javaOOP.lambdas.Printer;

public class LambdaDemo {
    public static String prefix="-";
    public static void test(String msg){}
    public static void show(){
        greet(( message -> System.out.println(prefix+message)
        ));
        // greet(new ConsolePrinter());

        // anon inner class 
        greet(new Printer() {
            // @Override
            @Override
            public void print(String message) {
                System.out.println(message);
                
            }

        });
          // Lambda 
          greet(message->test(message));
          //Class/object :: method;
        //   var demo=LambdaDemo;
          greet(LambdaDemo:: test);
        // greet(LambdaDemo:: new)

    }
    public static void greet(Printer printer){
        printer.print("Hello world");
    }
    public static void comsumer(){
        // comsumer
        List<Integer> list = List.of(1,2,3,4);
        for(var item: list)
        {
            System.out.println(item);
        }
        // another way to loop with comsumer interface is 
        list.forEach(t->{
            System.out.println("for each "+t);
        });
        // chaining comsumer
        List<String> list2=List.of("a","b","c");
        Consumer<String> print2=item-> System.out.print(item);
        Consumer<String> printUpperCase=item->  System.out.print(item.toUpperCase());
        list2.forEach(print2.andThen(printUpperCase).andThen(print2));
    }
    public static void supplier()
    {
        Supplier<Double> getRandom =()-> Math.random();
        var random=getRandom.get();
        System.out.println(random);
    }
    public static void functionInterface()
    {
        Function<String, Integer> map=str-> str.length();
        var length=map.apply("test 1 t2323");
        System.out.println(length);

        Function<String,String> replaceColon=str->str.replace(":","=");
        Function<String, String> addBraces= str->"{"+str+"}";
        var rersult= replaceColon.andThen(addBraces).apply("key:value");
        System.out.println(rersult);
    }
    
    public static void predicateInterface(){
        Predicate<String> isLongerThanSixInches=str->str.length()>6;
        var result=isLongerThanSixInches.test("MyDick");
        System.out.println("My dick is longer than 6 inches "+ result);
    }
}
