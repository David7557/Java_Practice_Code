package mockprepare;

public class Sample {
    static double m(double a){
        return (int) a;
    }

    public static void main(String[] args) {
        double n = m(10.45);
        System.out.println(n);
    }
}
