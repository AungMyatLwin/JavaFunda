package basic;
import java.util.Scanner;

class MortageCalculor {
    public static void main(String [] args){
        final byte MONTHS_IN_YEAR=12;
        final byte PERCENT=100;
        Scanner input=new Scanner(System.in);
        int principle= input.nextInt();
        float annualInterestRate=input.nextFloat();
        float monthlyInterest=annualInterestRate/PERCENT/MONTHS_IN_YEAR;
        int periodYear= input.nextInt();
        int numberOfPayments=periodYear*MONTHS_IN_YEAR;
        double mortgage=principle*((monthlyInterest*Math.pow((1+monthlyInterest), numberOfPayments))/(Math.pow((1+monthlyInterest), numberOfPayments)));
        System.out.println("Mortgage: "+mortgage);
    }
}
