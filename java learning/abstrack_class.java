

abstract class Super{

    public Super(){
        System.out.println("Super of constructor");
    }

    public void meth1(){
        System.out.println("Meth1 of super");
    }

    abstract void meth2();
}


class sub extends Super
{


    public void meth3() {

        System.out.println("Sub meth3");
        
    }
    @Override
    public void meth2() {

        System.out.println("meth2 of sub");
        
    }

}


class abstrack_class
{
    public static void main(String[] args) {
        
       //  Super s1;                  // we can only create ref of abstract class but we 
       //                                 cant create object of abstract class.


        Super s2 = new sub();        // dynamic method dispatch
        
        s2.meth1();
        s2.meth2();

        //  s2.meth3();             we cant write this

        sub sb =new sub();

        
        sb.meth2();
    }
}