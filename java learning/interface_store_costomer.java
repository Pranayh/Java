
interface Member
{
    void callback();
}

class Costumer
{
    String name;
    Costumer(String n)
    {
        name=n;
    }

    void callback()
    {
        System.out.println("Ok,i will visit :"+name)
    }

    
}

class Store
{
    Member mem[]= new Member[100];

    int count=0;

    void Resister(Member m)
    {
        mem[count++]=m;
    }

    void Invite()
    {
        for(int i=0;i<count;i++)
        {
            mem[i]=callback();
        }
    }
}










public class interface_store_costomer {
    public static void main(String[] args) {

        Store s= new Store();

        

        
    }
}
