interface practice
{
    void meth1();
    void meth2();
}


class myclass implements practice
{
    @Override
    public void meth1(){
        System.out.println("my_meth1"); 
    }


    public void meth2() {
        System.out.println("my_meth2");         //overided method
         
    }

    public void meth3() {

        System.out.println("my meth3");
        
    }
} 


public class interfaces {
    public static void main(String[] args) {
        
        practice p=new myclass();
        p.meth1();
        p.meth2();

        // p.meth3();           // we cant write this as in interfaces
    }
}
