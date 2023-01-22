package basic;
import java.text.NumberFormat;

public class FormatingNumbre {
    public static void main(String [] args){
        String res=NumberFormat.getPercentInstance().format(0.819);
        System.out.println(res);
    }
}
