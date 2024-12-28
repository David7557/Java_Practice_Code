package javaframeworks;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(20);
        al.add(12);
        al.add(10);
        al.add(14);
        al.add(13);
        al.add(15);

        Collections.sort(al);
        System.out.println(al);
        al.remove(1);
        System.out.println(al);

        for(int i: al){
            System.out.println(i);
        }
    }
}
