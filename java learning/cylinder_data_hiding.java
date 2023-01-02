class cylinder{

    private int radius;
    private int height;

    public double area(){
        return (2*Math.PI*radius*height + 2*Math.PI*radius*radius);
    }


    // constructers:

    public cylinder()
    {
        radius=0;
        height=0;
    }

    public cylinder(int r) {
        height=1;
        radius=r;
        
    }

    public cylinder(int r,int h)
    {
        radius = r;
        height=h;          ///  paramerizsed constructer
    }




    public int getradius()
    {
        return radius;
    }

    public int getheight()
    {
        return height;
    }

    public void setradius(int r)
    {
        radius=r;
    }

    public void setheight(int h)
    {
        height=h;
    }




    
    

}


public class cylinder_data_hiding {

    public static void main(String[] args) {


        cylinder c= new cylinder();

        c.setradius(5); 

        System.out.println("Area is: "+c.area());

        cylinder b= new cylinder(5);

        System.out.println("Area is: "+b.area());

        
    }
    
}
