import java.lang.*;
import java.util.*;

//package rectangle_1;

class rectangle
{

    public double length;
    public double breath;

    public double area()
    {
        return length*breath;
    }

    public double perimeter()
    {
        return 2*(length+breath);
    }

    
}

public class rectangle_1
{
    public static void main(String[] args) {

        rectangle r1= new rectangle();
    
        r1.length=10;
        r1.breath=8;
    
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        
    }
}
