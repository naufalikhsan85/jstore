public class TestThread {

    public static void main(String[] args)
    {



        Demo7_Threading thread1 = new Demo7_Threading("thread1");
        Demo7_Threading thread2 = new Demo7_Threading("thread2");
        Demo7_Threading thread3 = new Demo7_Threading("thread3");

        lionel.start();
        andres.start();
        messi.start();
    }
}
