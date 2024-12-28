package examples;

public class MethodsExample {
    static void addition(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    int substraction(int a, int b){
        if ( a < b){
            return b-a;
        }else if (a > b){
            return a - b;
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int a = 4; int b = 6;
        addition(a,b);

        MethodsExample m = new MethodsExample();
        int result = m.substraction(a, b);
        System.out.println(result);
    }
}
