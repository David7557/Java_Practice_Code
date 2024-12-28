package advancejava;

import java.util.Objects;
import java.util.Scanner;

public class Password {
    static void checkPassword(String password) throws PasswordMisMatchException{
        if(password.equals("David@2002")){
            System.out.println("Password Matched!!");
        }else{
            throw new PasswordMisMatchException("Invalid Password!");
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your Password: ");
        try{
            checkPassword(sc.nextLine());
        }catch (PasswordMisMatchException e){
            System.out.println(e.getMessage());
        }
    }
}
