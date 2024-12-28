package javaframeworks;

public class PenMainClass {
    public static void main(String[] args) {
        Pen p1 = new Pen("Camlin", 20);
        Pen p2 = new Pen("Parker", 45);

        System.out.println(p1);
        System.out.println(p2.toString());
    }
}
