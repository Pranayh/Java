
class product{

    private float item_no;
    private String name;
    private float price;
    private int qnty;


    
    public product(float in,String n,float p,int qt)
    {
        item_no=in;
        name=n;
        price=p;
        qnty=qt;
        
    }

    public double bill()
    {
        return (price*qnty);
    }


    public float getitem_no() {

        return item_no;
        
    }

    public float getprice() {

        return price;
        
    }

    

    public void setqnty(int q) {

        qnty=q;
        
    }


    
    


}

public class constructer_test_and_properties {
    public static void main(String[] args) {

        product x=new product(12,"milk",40,4);
        x.setqnty(10);

        System.out.println("Your Bill is :"+ x.bill());

        System.out.println("Product No. is :"+ x.getprice());

        
        
    }
}
