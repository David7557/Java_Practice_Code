package collectionframework;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add("david");
        al.add('A');
        
        ArrayList al1 = new ArrayList();
        al1.add(40);
        al1.addAll(al);
        al1.add(40);

       /* System.out.println(al1);
        System.out.println(al1.contains(40));
        al1.remove(1); //al1.removeAll(al);
         System.out.println(al1);
        System.out.println(al1.containsAll(al));

        System.out.println(al1.size());*/

        /*al1.clear();
        System.out.println(al1);
        System.out.println(al1.isEmpty());*/

        /*for ( Object obj: al){
            System.out.println(obj);
        }*/


        /*----------------------------------------------*/

        System.out.println(al1);
        System.out.println(al1.get(1));
        System.out.println(al1.indexOf(40));
        System.out.println(al1.lastIndexOf(40));

        al1.add(2, 45);
        System.out.println(al1);
        al1.set(2, 40);
        System.out.println(al1);

    }
}
