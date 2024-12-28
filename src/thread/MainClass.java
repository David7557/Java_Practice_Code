package thread;

public class MainClass {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();

        System.out.println("-------------");

        Thread td = new Thread(new Car());
        td.start();

    }
}
