package examples;
/*
class Abstract_Examples{
    public  void gto(){
       // static int c = 20;
    }

        public static void main(String[] args) {
            System.out.println("Main method invoked!");

            // Explicitly invoking the main method
            */
/*String[] newArgs = {"arg1", "arg2"};
            Abstract_Examples.main(newArgs);*//*


           // static int b = 10; not possible
           // private int n = 10;
        }


}*/

/*import java.util.ArrayList;

class Abstract_Example{
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add(20);
        a.add(34.5);
        a.add("String");
        //a.remove(1);
        ArrayList al = new ArrayList();
       // al.add(a);
        al.add(45);
        al.add(56);
        //al.remove(a);
        al.addAll(a);
//        al.removeAll(a);
        System.out.println(al.contains(10));
        System.out.println(al.containsAll(a));

        System.out.println(al);
    }
}*/

/*import java.util.LinkedList;

class Abstract_Example{
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(15);
        ll.add(20);
        System.out.println(ll.get(1));
    }
}*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Car{
    String brand;
    int cost;
    Car(String brand, int cost){
        this.brand =  brand;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Brand: "+brand+" Cost: "+cost;
    }
}

class Abstract_Example{
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki", 10001);
        Car c2 = new Car("Honda", 20000);
        ArrayList<Car> al = new ArrayList<>();
        al.add(c1);
        al.add(c2);

       /* for (Object obj: al){
            System.out.println(obj.toString());
        }*/

        ListIterator<Car> c = al.listIterator();
        while(c.hasNext()){
            System.out.println(c.next());
        }
        while(c.hasPrevious()){
            System.out.println(c.previous());
        }
    }
}























