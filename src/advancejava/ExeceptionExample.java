package advancejava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExeceptionExample {

    static void getFile() throws FileNotFoundException {
        FileReader f = new FileReader("car.txt");
    }
    public static void main(String[] args) {
        // for unchecked exception
        int a = 10;
        try{
            System.out.println(a / 0);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        //Checked Exception

        try{
            getFile();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }


    }

}
