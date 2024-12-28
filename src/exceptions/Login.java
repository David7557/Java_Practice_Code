package exceptions;

import java.util.Scanner;

public class Login {

    public static void login() throws InvalidUsernameException, InvalidPasswordException{
        String currUsername = "davidkumar7557@gmail.com";
        String currPassword = "David@2002";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your username:");
        String username = sc.next();

        if(username.equals(currUsername)){

            System.out.println();
            System.out.print("Enter your password:");
            String password = sc.next();
            sc.close();

            if(password.equals(currPassword)){
                System.out.println("Login Successfully !!!");
            }else {
                throw new InvalidPasswordException("Incorrect password!");
            }
        }else {
            throw new InvalidUsernameException("Invalid username!");
        }
    }

    public static void main(String[] args) {

        try{
            login();
        }catch (InvalidUsernameException e){
            System.out.println(e.getMessage());
        }catch (InvalidPasswordException e){
            System.out.println(e.getMessage());
        }

    }
}
