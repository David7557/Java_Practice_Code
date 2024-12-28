package exceptions;

import java.util.Scanner;

public class VerifyPassword {

    public static void verify(String password) throws InvalidPasswordException{
        String existingPassword = "david@2002";
        if(password.equals(existingPassword)){
            System.out.println("Correct Password!!");
        }else {
            throw new InvalidPasswordException("Incorrect Password!!");
        }

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = sc.next();
        try{
            verify(password);
        }catch (InvalidPasswordException e ){
            System.out.println(e.getMessage());
        }
    }
}
