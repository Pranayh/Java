public class account_work {

    public static void main(String[] args) {
        
        float acc_no=1001;
        double ab=250000,sa=40000;
        String loanty ="house";
        double ex_loan=300000,eli_loan=0;
        int ex_emi=30,eli_emi=0;

        if(((acc_no>=1000)&&(acc_no<=1999)) && (ab>=1000) )
        {
            if(loanty=="car")
            {
                if(sa>25000)
                {
                    eli_loan=500000;
                    eli_emi=36;
                    System.out.println("eligible Amount: "+eli_loan);
                    System.out.println("eligible emis: "+eli_emi);
                }
                else{
                    System.out.println("Not Eligible");
                }
            }

            else if(loanty=="house")
            {
                if(sa>50000)
                {
                    eli_loan=6000000;
                    eli_emi=60;
                    System.out.println("eligible Amount: "+eli_loan);
                    System.out.println("eligible emis: "+eli_emi);
                }
                else{
                    System.out.println("Not Eligible");
                    
                }

            }
            else{
                if(sa>75000)
                {
                    eli_loan=7500000;
                    eli_emi=84;
                    System.out.println("eligible Amount: "+eli_loan);
                    System.out.println("eligible emis: "+eli_emi);
                    
                }
                else{
                    System.out.println("Not Eligible");
                }  
            }
        }

        else{
            System.out.println("Invalide Data Provided");
        }


       




    }
    
}
