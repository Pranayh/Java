import java.util.Scanner;
public class fizz_project {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number:");

        int num = scanner.nextInt();


        if(num%5==0){
            if(num%3==0) {
                System.out.println("FizzBizz");
                
            }
            else{
                System.out.println("Fizz");
            }
            


        }
        else if(num%3==0 && num%5!=0){
            System.out.println("Bizz");
        }

        else{
            System.out.println(num);
        }

    }
}
