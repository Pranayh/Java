
class phone
{
    public void call() { System.out.println("Phone call"); }
    public void sms() { System.out.println("Phone sending SMS"); }
}


interface camera
{
    void click();
    void record();
}

interface music_player
{
    void play();
    void pause();
}


class smartphone extends phone implements camera , music_player
{

    public void videocall() {

        System.out.println(" Smartphone feature videocall");
    }

    

    
    public void click() { System.out.println("Smart Phone Clicking Photo"); }
    public void record() { System.out.println("Smart Phone recording video"); }
    public void play() { System.out.println("Smart Phone playing music"); }
    public void pause() { System.out.println("Smart Phone stopped playing music"); }

}






public class interface_smartphone {
    public static void main(String[] args) {

        smartphone sp=new smartphone();

        sp.call();
        sp.play();              // in object of smartphone we can do every method in smartphone
        sp.click();
        sp.videocall();

        
        camera c=sp;
        c.click();                 // we cant create object of an interface class but we can ref to object of implemented class
        c.record();                   // i.e here we can use camera interface it gives ref to smartphone.
                                   // but it can only implements methods of camera only
        


    }
}
