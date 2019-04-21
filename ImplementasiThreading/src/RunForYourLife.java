public class RunForYourLife implements Runnable
{
    private Thread thread;
    private String nama;
    private String namathread;
    private int checkpoint;
    private double berat;

    public RunForYourLife(String nama, double berat) {
        this.nama=nama;
        this.namathread=nama+"Thread";
        this.berat=berat;
        this.checkpoint=0;
    }


    public void run(){

        System.out.println(nama + ", go!");


        while(getCheckpoint() != 20){

            int randNumber = (int) Math.round(LetsGo.getRandomNumber()*berat);
            try {
                Thread.sleep(randNumber);
            } catch (InterruptedException e) {
                System.out.println(nama + " interrupted.");
            }
            System.out.println(nama + " has passed checkpoint " +  checkpoint);
            checkpoint++;
        }


        System.out.println(nama + " has finished!");
    }

    public void start() {
        if (thread == null) {

            thread = new Thread(this, namathread);
            System.out.println(nama + ", ready!");

            System.out.println(nama + ", set!");
            thread.start();
        }
    }

    public String getNama(){
        return nama;
    }

    public int getCheckpoint() {
        return checkpoint;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public void setCheckpoint(int checkpoint){
        this.checkpoint=checkpoint;
    }


}
