package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class ArrDemo {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        al.add(20);
        al.add(34);
        al.add(12);
        al.add(67);
        al.add(10);

        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);

        Collections.reverse(al);
        System.out.println(al);
    }
}
