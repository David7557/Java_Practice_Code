package filehandling;

import java.io.File;

public class CreateFolder {
    public static void create(String folderName){

        File f = new File(folderName);
        f.mkdir();
    }
}
