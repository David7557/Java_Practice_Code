package filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static File createFile(String fileName) throws IOException {

        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}