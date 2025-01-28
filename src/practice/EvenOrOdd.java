package practice;

public class EvenOrOdd {
    public static void checkEvenOrOdd(int num) {
        if (num % 2 == 0){
            System.out.print("Even");
        }else {
            System.out.println("Odd");
        }
    }

    static public void main(String[] args) {
        checkEvenOrOdd(10);
    }
}
