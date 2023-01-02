import java.lang.*;
import java.util.*;

public class input_string {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);

        String name;

        System.out.println("Please tell me your name: ");
        name = s.nextLine();

        System.out.println("Welcome Mr."+name);

    }
    
}
