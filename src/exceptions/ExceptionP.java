package exceptions;

import java.io.FileNotFoundException;

public class ExceptionP {
    public static void main(String[] args) {
        System.out.println("start");
        try{
            ThrowsExample.calculate();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("End");
    }
}
