
class reactangle
{
    private int length;
    private int breath;


    public int area() {

        return length*breath; 
        
    }

    public void setlen(int l)
    {
        length=l;
    }

    public void setbre(int b){

        breath=b;

    }

    public int getlen()
    {
        return length;
    }

    public int getbre()
    {
        return breath;
    }
}






public class data_hiding {

    public static void main(String[] args) {

        reactangle r = new reactangle();

        r.setlen(4);
        r.setbre(2);

        System.out.println("length and breath are:"+ r.getlen()+" and "+r.getbre());

        System.out.println(" Area: "+r.area());

        
    }
    
}
