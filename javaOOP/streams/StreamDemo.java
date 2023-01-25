package javaOOP.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static List<Movie> movies=List.of(
        new Movie("The Prestige", 10000,Genre.Comedy),
        new Movie("Mia Khalifa Goes To Town",20000,Genre.Action)
    );
    public static void show(){
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
    public static void mapping(){
        movies.stream().map(movie->movie.getTitle()).forEach(t -> System.out.println(t));
        // flatmap
        var stream=Stream.of(List.of(1,1,2,3),List.of(2,3,45));
        stream.flatMap(list-> list.stream()).forEach(t->System.out.println(t));
    }
    public static void filtering(){
        movies.stream().filter(movie->movie.getLikes()>10).forEach(s->System.out.println(s.getTitle()));
    }
    public static void sliclingStream(){
        //limit, skip, takeWhile(), dropWhile();
        movies.stream().limit(2).forEach(m->System.out.println(m.getTitle()));
        // takewhile
         movies.stream().takeWhile(m-> m.getLikes()<40).forEach(m->System.out.println(m.getTitle()));
         // dropwhile
         movies.stream().dropWhile(m-> m.getLikes()<40).forEach(m->System.out.println(m.getTitle()));
    }
    public static void sortStream(){
        // movies.stream().sorted((a,b)->a.getLikes().compareTo(b.getTitle())).forEach(m->System.out.println(m));
        movies.stream().sorted(Comparator.comparing(Movie::getTitle).reversed())
        .forEach(m->System.out.println(m.getTitle()));
    }
    public static void distinctElement(){
        movies.stream().map(Movie:: getLikes).distinct().forEach(t->System.out.println(t));
    }
    public static void peek(){
        movies.stream().filter(m->m.getLikes()<10).peek(m->m.getTitle()).map(m->m.getTitle()).forEach(t->System.out.println(t));;
    }
    public static void reducers(){
        movies.stream().count();//
        // .anyMatch .noneMatch .findFirst .findAny .max .min;
    }
    public static void reduce(){
        // later
        int [] numbers= new int[5];
        numbers[0]=1;
        numbers[1]=10;
        numbers[2]=12;
        numbers[3]=13;
        numbers[4]=19;
        OptionalInt total=Arrays.stream(numbers).reduce((a,b)->a+b);
        System.out.println(total.orElse(0));
    }
    public static void collectors(){
        var mapMovies=movies.stream().collect(Collectors.toMap(m->m.getTitle(), n->n.getLikes()));
        System.out.println(mapMovies);
    }
    public static void groupingElements(){
        var genresMovies=movies.stream().collect(Collectors.groupingBy(Movie::getGenre,Collectors.mapping(Movie::getTitle,Collectors.joining("s"))));
        System.out.println(genresMovies);
    }
    public static void partitioningElements(){
        var genresMovies=movies.stream().collect(Collectors.partitioningBy(m->m.getLikes()>20));
        System.out.println(genresMovies);
    }
    public static void primitiveTypeStream(){
        var intStream=IntStream.rangeClosed(1, 5);
        intStream.forEach(t->System.out.println(t));
    }
}