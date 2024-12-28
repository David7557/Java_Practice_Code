package abstractionex;

import java.util.Scanner;

public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new BanKImplementation();

        System.out.println("----------------Banking System-----------------");
        System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw");
        System.out.print("Enter your choice to perform: ");
        int choice = sc.nextInt();
        if (choice >= 1 && choice <= 3){
            switch (choice){
                case 1: {
                    b.checkBalance();
                    break;
                }
                case 2: {
                    System.out.print("Enter your amount to deposit: ");
                    b.deposit(sc.nextInt());
                    break;
                }
                case 3: {
                    System.out.print("Enter amount to withdraw: ");
                    b.withdraw(sc.nextInt());
                    System.out.println("Withdrawn Successfully!!");
                    break;
                }
                default: {
                    System.out.println("Wrong choice");
                }
            }
        }else {
            System.out.println("try again");
        }


    }
}
