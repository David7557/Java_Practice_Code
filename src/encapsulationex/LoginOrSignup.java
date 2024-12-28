package encapsulationex;

import java.util.Scanner;

public class LoginOrSignup {
    public static void main(String[] args) {
        Instagram i = new Instagram();
        Scanner sc = new Scanner(System.in);

        System.out.println("Set userid and password:");
        System.out.print("Enter your userid: ");
        String userid = sc.next();
        System.out.println(" ");
        System.out.print("Enter your password: ");
        String password = sc.next();

        i.setUserid(userid);
        i.setPassword(password);

        String getUserid = i.getUserid();
        System.out.println(getUserid);
        String getPassword = i.getPassword();
        System.out.println(getPassword);

    }
}
