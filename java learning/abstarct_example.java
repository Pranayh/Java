
abstract class Shape{

// as shape dont have propeties like radius and length and breadth



    abstract double perimeter();
    abstract double area();

}



class circle extends Shape{
    public double radius;

    circle(double r)
    {
        radius=r;
    }

    public double perimeter(){
        
        return (2*3.14*radius);
    }

    
    public double area(){

        return (3.14*radius*radius);
    }

    
}

class react extends Shape{
    
    public double length;
    public double breath;

    react(double l,double b){
        length=l;
        breath=b;
    }

    public double perimeter(){
        
        return 2*(length+breath);
    }
    
    
    public double area(){

        return length*breath;
        
    }




}



public class abstarct_example {
    public static void main(String[] args) {
        
        Shape s=new circle(3);
        System.out.println("Perimer of Circle is :"+s.perimeter());
        
        Shape s1= new react(2,4);
        
        System.out.println("Area of An Reactangle is :"+s1.area()+);
        

    }
}
