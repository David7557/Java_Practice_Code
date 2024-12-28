package examples;

public class MethodOverloading {
    int addition(int a, int b){
        return a+b;
    }

    int addition(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        int a = 10, b = 23, c = 30;

        MethodOverloading m = new MethodOverloading();
        System.out.println(m.addition(a, b));
        System.out.println(m.addition(a, b, c));
    }
}
