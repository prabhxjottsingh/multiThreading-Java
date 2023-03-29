/*
       user thread is main thread, other threads are custom threads
       if Daemon thread is false, then all threads will continue and work till they terminate
       if Daemon thread is true, then once userThread terminates, then Daemon threads wil stop working, doesn't matter if its terminated or not.
*/
package MultiThreading;

import java.lang.*;

public class ThreadTester{
    public static void main(String[] args){

/*
        System.out.println("Main is starting");
//        Thread thread1 = new Thread1("first Thread"); //by extending the Thread Class
//        thread1.setDaemon(true);
//        thread1.start();

//        Thread thread2 = new Thread(new Thread2(), "second Thread"); //By implementing runnable interface
        Thread thread2 = new Thread(() -> {
            for(int i = 1; i <= 5; i++){
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }, "Thread Two");
        thread2.start();

        System.out.println("Main is exiting.");
*/
        System.out.println("Main is sarting: ");
        Stack st = new Stack(5);

        new Thread(()->{
            int counter = 0;
            while( ++counter < 10 ){
                System.out.println("Pushed: " + st.push(100));
            }
        }, "Pusher").start();

        new Thread(()->{
            int counter = 0;
            while( ++counter < 10 ){
                System.out.println("Popped: " + st.pop());
            }
        }, "Popper").start();

        System.out.println("Main is Exiting.");

    }
}
