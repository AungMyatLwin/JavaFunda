package dsa.linear.Arrays;

public class Main {
    public static void main(String [] args){
        // Array.show();
        // Array.len();
        ArrayExercise numbers=new ArrayExercise(2);
        numbers.insert(1);//0
        numbers.insert(22);//1
        numbers.insert(23);//1
        numbers.insert(24);//1
        numbers.insert(25);//1
        numbers.insert(3);//2
        numbers.insert(3);//2
        // numbers.insert(3);//2

        
        numbers.removeAt(1);
        numbers.print();
        numbers.indexOf(24);
    //    System.out.println("length: "+numbers);

    }
}
