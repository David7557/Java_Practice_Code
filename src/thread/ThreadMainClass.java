package thread;

public class ThreadMainClass {
    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.setName("demo");
        td.setPriority(6);


        td.start();

        System.out.println("Id: "+ td.threadId());
        System.out.println("Name: "+td.getName());
        System.out.println("Priority: "+td.getPriority());



    }
}
