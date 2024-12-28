package collectionframework;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMaps {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(101, "David Kumar Hansdah");
        lhm.put(102, "Sumit Kumar Prusty");
        lhm.put(103, "Jyoti Ranjan Rana");
        lhm.put(104, "Kartikeswar Mohanty");
        lhm.put(105, "Nayanjyoti Sahu");

        Set<Integer> keys = lhm.keySet();
        for(int key:keys){
            System.out.println(key+" --> "+lhm.get(key));
        }
    }
}
