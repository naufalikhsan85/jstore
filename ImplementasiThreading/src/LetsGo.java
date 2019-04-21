import static java.lang.Math.random;
public class LetsGo
{
    public LetsGo() {
    }

    public static void main(String[] args) {

        double beratLionel = 1;
        double beratAndres = 0.8 ;
        double beratMessi = 0.4;

        RunForYourLife lionel = new RunForYourLife("Lionel", beratLionel);
        RunForYourLife andres = new RunForYourLife("Andres", beratAndres);
        RunForYourLife messi = new RunForYourLife("Messi", beratMessi);

        lionel.start();
        andres.start();
        messi.start();
    }

    public static int getRandomNumber(){
        //Random Number Between 100-500
        return (int)(Math.random() * ((5000 - 100) + 1)) + 100;
    }


}







