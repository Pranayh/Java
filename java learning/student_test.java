import java.lang.*;
import java.util.*;

class student{

    public int roll;
   
    public String name;

    public int m1,m2,m3;

    public int total_marks(){
        return (m1+m2+m3);
    }

    public double average(){
        return (m1+m2+m3)/3 ;
    }

    public boolean result(){

        return ((m1+m2+m3)/3 >= 50);
    }


    

}



public class student_test {
    public static void main(String[] args) {

        student s = new student();

        s.roll=23;
        s.name="pranay";
        s.m1=87;
        s.m2=84;
        s.m3=90;

        System.out.println("Total: "+s.total_marks());
        System.out.println("Average: "+s.average());
        System.out.println("Pass: "+s.result());
        
    }
    
}
