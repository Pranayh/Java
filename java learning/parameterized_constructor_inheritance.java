import java.net.SocketPermission;

import javax.print.event.PrintJobListener;

class Reactangle
{
    private int length;
    private int breadth;

    public Reactangle()
    {
        length=1;
        breadth=1;
    }

    public Reactangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }

    public int getlength(){
        return this.length;
    }

    public int getbreadth(){
        return this.breadth;
    }


}

class cube extends Reactangle
{
    private int height;

    public cube()
    {
        height=1;
    }

    public cube(int h){
        height=h;
    }

    public cube(int length,int breadth)
    {
        super(length,breadth);
    }

    
    public cube(int length,int breadth,int height)
    {
        super(length,breadth);
        this.height=height;
        System.out.println("Values are under class: "+length+" "+breadth+" "+height);
    }

    public int volume()
    {
        return getlength()*getbreadth()*getheight();
        
    }

    public int getheight(){
        return this.height;
    }
}

class parameterized_constructor_inheritance
{
    public static void main(String[] args) {
        
        cube c = new cube(4,2,3);
       
        System.out.println("values in outer class: "+ c.getlength()+" "+c.getbreadth()+" "+c.getheight());
        System.out.println("Volume of an cube is: "+c.volume());

    }
}