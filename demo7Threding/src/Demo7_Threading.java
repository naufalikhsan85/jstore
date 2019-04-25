public class Demo7_Threading extends Thread
{
    private Thread t;
    private String name;
    private String threadName;


    public Demo7_Threading(String name) {

        this.name = name;
        this.threadName = name;

    }

    public void Run()
        {

                try {
                    for (int i = 10;  i >=0; i--){
                        Thread.sleep(1000);
                    }
                }
                catch(InterruptedException e){
                        System.out.print(name);}
                }



        }


     public void Start
        {
            if (t == null) {
                //Creating the Thread
                t = new Thread(this, threadName);
                System.out.println(name );
                t.start();
            }
        }

}

