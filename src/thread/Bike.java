package thread;

public class Bike extends Thread{
    @Override
    public void run(){
        Thread td = Thread.currentThread();
        td.setName("bike thread");
        System.out.println(td.getName()+ " is running!!");
    }
}
