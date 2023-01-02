public class exception_handling1 {
    public static void main(String[] args) {
        
        
        try {
            int a,b,c;
        a=10;
        b=0;

        c=a/b;

        System.out.println("Sum is "+c);
        } 
        catch (ArithmeticException e) {
            System.out.println("Dividing by zero "+e);
        }


    }
}
