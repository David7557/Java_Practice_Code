package practice;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0){
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number+" is Prime Number");
        }else {
            System.out.println(number+" is Not a Prime Number");
        }
    }
}
