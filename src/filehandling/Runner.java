package filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your folder name:");
        String folderName = sc.nextLine();

        CreateFolder.create(folderName);

       FileWriter fw =  Write.writeIt();


    }
}
