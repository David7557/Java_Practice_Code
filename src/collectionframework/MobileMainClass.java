package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class MobileMainClass {
    public static void main(String[] args) {

        Mobile m1 = new Mobile("Samsung", "Ocean", 15000.0);
        Mobile m2 = new Mobile("Apple", "Blue", 24000.0);
        Mobile m3 = new Mobile("POCO", "White Storm", 12000.0);


        LinkedList<Mobile> ll = new LinkedList<Mobile>();
        ll.add(m1);
        ll.add(m2);
        ll.add(m3);

        Collections.sort(ll, new MobilePriceComparator());
        for (Mobile m : ll){
            System.out.println(m);
        }
    }
}
