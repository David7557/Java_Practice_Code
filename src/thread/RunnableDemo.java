package thread;

public class RunnableDemo implements Runnable{
    @Override
    public void run(){

        Thread td = Thread.currentThread();
        System.out.println(td.getName()+" is running!!");
    }
}
