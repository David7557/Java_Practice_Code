package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Write {
    public static FileWriter writeIt() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = sc.nextLine();
        FileWriter fw = new FileWriter(CreateFile.createFile(fileName));
        fw.write("David Kumar Hansdah");
        fw.flush();
        fw.close();
        System.out.println("Done");

        return fw;
    }
}
