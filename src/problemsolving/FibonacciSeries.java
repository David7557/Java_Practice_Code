package problemsolving;

public class FibonacciSeries {
    public static void fibonacci(int count){
        int first = 0;
        int second = 1;
        int temp = 0;

        System.out.print(first+" "+second);
        for(int i = 2; i < count; i++){
            temp = first + second;
            System.out.print(" "+temp);
            first = second;
            second = temp;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
