package exceptions;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");

        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible for vote!!");
        }else{
            try{
                throw new AgeInvalidExcepiton("Invalid age!!");
            }catch (AgeInvalidExcepiton e){
                System.out.println(e.getMessage());
            }
        }
    }
}
