package markerinterface;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTest {
    public static void main(String[] args) throws IOException {

        Employee emp = new Employee("David", 101, 22);

        FileOutputStream fos = new FileOutputStream("emp_info.txt");

        ObjectOutputStream oops = new ObjectOutputStream(fos);
        oops.writeObject(emp);
        oops.close(); fos.close();

    }
}
