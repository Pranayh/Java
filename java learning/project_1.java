import java.security.Principal;
import java.util.Scanner;

public class project_1 {
    
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
        System.out.print("Principal:");
    int p = scanner.nextInt();


        System.out.print("Annual Interest Rate:");
    float rate = scanner.nextFloat();

    rate=rate/100/12;



    System.out.print("Period(Years):");

    int period = scanner.nextInt();

    period=period*12;
    
    

    double morgage= p*
    (rate*Math.pow(1+rate, period))/
    (Math.pow(1+rate, period)-1);

    System.out.print("Morgage: $"+morgage);




    }
}
