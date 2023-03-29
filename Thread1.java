
public class Thread1 extends Thread{

    //Giving the thread1 a name, with the help of overloading
    public Thread1(String threadName){
        super(threadName);
    }

    @Override
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
