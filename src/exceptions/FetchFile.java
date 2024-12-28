package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FetchFile {

    static void getDisplay() throws FileNotFoundException {
        FileReader file = new FileReader("car.txt");

    }
    public static void main(String[] args) {
        try{
            getDisplay();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
