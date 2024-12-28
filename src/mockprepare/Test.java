package mockprepare;

class Theater extends Thread {
    @Override
    public void run(){
        Thread t = Thread.currentThread();
        System.out.println("Thread Name: "+t.getName());
        System.out.println("Id: "+t.getId());
        System.out.println("Priority: "+t.getPriority());
    }
}

public class Test{
    public static void main(String[] args){
        Theater tr = new Theater();
        tr.setName("David");
        tr.start();

    }
}