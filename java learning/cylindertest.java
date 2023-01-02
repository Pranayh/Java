import java.lang.*;
import java.util.*;


class cylinder{

    int radius;
    int height;

    public double area(){
        return (2*Math.PI*radius*height + 2*Math.PI*radius*radius);
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class cylindertest {
    public static void main(String[] args) {

        cylinder c = new cylinder();

        c.radius =5;
        c.height =10;

        System.out.println("Area: "+c.area());
        System.out.println("Volume: "+c.volume());
        



        
    }
}
