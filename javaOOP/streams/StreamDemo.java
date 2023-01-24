package javaOOP.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void show(){
        List<Movie> movies=List.of(
            new Movie("The Prestige", 10000),
            new Movie("Mia Khalifa Going Town",20000)
        );
        // Imperative Programming
        int count=0;
        for(var movie: movies){
            if(movie.getLikes()>10000)
            {
                count++;
            }
        }
        // Functional Programming
       int count2= (int) movies.stream().filter(movie->movie.getLikes()>1000).count();
       System.out.println(count2);
    }
    public static void creatingStream(){
        var stream=Stream.generate(()->Math.random());
        System.out.println(stream);
        stream.limit(10).forEach(n->System.out.println(n));
    }
    public static  void streamIterate(int seed){
       var stream=Stream.iterate(seed,n->n*3);
       stream.limit(10).forEach(n->System.out.println(n));
       System.out.println(stream);
        // return ;
    }
}
