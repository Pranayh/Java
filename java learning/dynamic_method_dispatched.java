
class superclass
{
    
    public void meth1() {
        System.out.println("Super_meth1");
        
    }

    public void meth2() {

        System.out.println("Super meth2");
        
    }


}

class subclass extends superclass
{
    @Override
    public void meth2() {
        System.out.println("Sub_meth2");         //overided method
         
    }

    public void meth3() {

        System.out.println("Sub meth3");
        
    }
}








public class dynamic_method_dispatched {
    public static void main(String[] args) {
        
        superclass s = new subclass();

        s.meth2();
        s.meth1();
       // s.meth3();    // here the reff is from superclass and meth3 is not present in superclass 
                        //so that it runs only methods which are preset only in superclass.
    }
}
