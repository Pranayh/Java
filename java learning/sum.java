import java.lang.*;
import java.util.*;

import javax.print.event.PrintJobListener;


class tester{
	public static void main(String[] args) {
		// Implement your code here 
		
		Scanner s = new Scanner(System.in);
		
		int a,b,c,pro;
		
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		
		
		if(a!=7 && b!=7 && c!=7)
		{
		   pro=a*b*c;
		}
		else if(a==7){
		
		pro=b*c;
		
		}
		else if(b==7)
		{
		pro=c;
		}
		else
		{
		pro=-1;
		}
		
        System.out.println(pro);
		
		
	}
}
