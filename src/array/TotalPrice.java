package array;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Products ? : ");
        int numberOfProducts = sc.nextInt();

        double[] price = new double[numberOfProducts];
        System.out.print("Enter the prices: ");
        for(int i = 0; i < price.length; i++){
            System.out.print("Enter price: ");
            price[i] = sc.nextDouble();
        }
        double totalPrice = 0;
        for (double i : price){
            totalPrice += i;
        }

        System.out.println("total price: "+ totalPrice);
    }
}
