package thread;

public class RunnableMainClass {
    public static void main(String[] args) {
        RunnableDemo rd = new RunnableDemo();
        Thread td = new Thread(rd);

        td.setName("runnable");

        td.start();
    }
}
