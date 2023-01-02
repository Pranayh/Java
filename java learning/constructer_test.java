import java.lang.*;
import java.util.*;

class add{

    private int num1;
    private int num2;


    public add(){
        num1=1;                 // default constructer 
        num2=1;
    }

    public add(int a,int b){
        num1=a;
        num2=b;                    // paramatarized constructer
    }

    public int addition(){
        return (num1+num2);
    }

}







public class constructer_test {

    public static void main(String[] args) {

        add sum = new add();

        System.out.println("Defalt sum:"+ sum.addition());

        add sum2= new add(10,20);

        System.out.println("Paramarized sum:"+ sum2.addition());

        
    }
    
}
