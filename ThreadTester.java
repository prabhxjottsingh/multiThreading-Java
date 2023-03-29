import java.lang.*;

public class ThreadTester{
    public static void main(String[] args){

        System.out.println("Main is starting");

        Thread thread1 = new Thread1("FirstThread");

        /*
        user thread is main thread,
        if Daemon thread is false, then all threads will continue and work till they terminate
        if Daemon thread is true, then once userThread terminates, then Daemon threads wil stop working, doesn't matter if its terminated or not.
         */

//        thread1.setDaemon(true);
        //if user thread stops working, i.e. main thread stop working, then setDaemon may not run.
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();

        System.out.println("Main is exiting.");

    }
}
