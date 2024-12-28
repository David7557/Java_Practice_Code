package examples;

import collectionframework.LinkedHashMaps;

import java.util.*;

class Study{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println("----------------------------");

        // Accessing element  using for loop

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println("----------------------------");

        // Accessing element using foreach loop

        for (Integer i:list){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        // Accessing element using iterator
        Iterator<Integer> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println("----------------------------");

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(34,"david"));
        students.add(new Student(45,"rama"));
        students.add(new Student(12,"johnson"));
        students.add(new Student(23,"lovely"));
        students.add(new Student(25,"ranga"));

        students.sort(new StudentAgeComparator());

        for (Student student: students){
            System.out.println(student.name+" "+student.age);
        }


        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(90);
        ts.add(50);
        ts.add(60);
        ts.add(45);
        ts.add(34);
        ts.add(12);
        System.out.println(ts);
        for (Integer i : ts){
            System.out.println(i);
        }
        System.out.println("===========================");
        TreeMap<Integer, String> details = new TreeMap<>();
        details.put(101, "David");
        details.put(103,"Kaleyan");
        details.put(102,"Narayan");
        details.put(105,"Jakta");
        details.put(104,"Ananta");

        Set<Integer> keys = details.keySet();
        for(Integer i:keys){
            System.out.println(i+" "+details.get(i));
        }

        System.out.println("--------------------------------");

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);

        for (Integer i: linkedHashSet){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");
        PriorityQueue<String> name = new PriorityQueue<>();
        name.add("David");
        name.add("Raja");
        name.add("Kumar");
        name.add("Summit");

        for(String s: name){
            System.out.print(s+" | ");
        }
        System.out.println();
        System.out.println("--------------------------");

        Set<String> set = new HashSet<>(name);
        System.out.println(set);

        System.out.println("--------------------------");
        LinkedHashSet<String> lsm = new LinkedHashSet<>(set);
        System.out.println(lsm);
        System.out.println("--------------------------");
        List<String> setOfNames = new ArrayList<>(lsm);
        Collections.sort(setOfNames);
        System.out.println(setOfNames);

    }
}