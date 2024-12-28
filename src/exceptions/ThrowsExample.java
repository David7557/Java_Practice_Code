package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample {
    public static void calculate() throws FileNotFoundException {
        FileReader fr = new FileReader("car.txt");
    }

}
