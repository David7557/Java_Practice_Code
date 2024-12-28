package collectionframework;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("david_hansdah", "david@2002");
        map.put("hansdah_dav", "David@2002");
        map.put("bagahi_vines", "bagahi@2003");

        System.out.println(map.get("david_hansdah"));

        System.out.println(map.containsKey("hansdah_dav"));
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsValue("david@2002"));
        //map.remove("bagahi_vines");
        //map.remove("bagahi_vines", "bagahi@2003");
        map.clear();
        System.out.println(map+" "+map.isEmpty());

       /* Set<String> keys = map.keySet();

        for(String key: keys){
            System.out.println(key+" ----> "+map.get(key));
        }*/
    }
}
