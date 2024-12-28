package thread;

public class Car implements Runnable{
    @Override
    public void run(){
        Thread td = Thread.currentThread();
        td.setName("car thread");
        System.out.println(td.getName()+" is running!!");
    }
}
