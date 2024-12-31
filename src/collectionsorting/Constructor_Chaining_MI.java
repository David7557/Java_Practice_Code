package collectionsorting;


public class Constructor_Chaining_MI  {
    public static void display(Electric_Car car){
        if(car instanceof MSuzuki){
            MSuzuki s = (MSuzuki) car;
            s.displayInfo();
        }else {
            TTesla t = (TTesla) car;
            t.displayInfo();
        }
    }
    public static void main(String[] args){
        Electric_Car v1 = new MSuzuki("Alto K10", 70);
        Electric_Car v2 = new TTesla("Tesla 5", 100);
        display(v1);
        System.out.println("-----------------------------");
        display(v2);

    }
}

abstract class AVehicle {
    String model;

    AVehicle(String model){
        this.model = model;
    }

    abstract void displayModel();
}

interface IElectric {
    void displayCapacity();
}

abstract class Electric_Car extends AVehicle implements IElectric {
    int capacity;
    Electric_Car(String model, int capacity){
        super(model);
        this.capacity = capacity;
    }
}

class MSuzuki extends Electric_Car {
    MSuzuki(String model, int capacity){
        super(model, capacity);
    }

    @Override
    public void displayModel(){
        System.out.println("Suzuki Model: "+model);
    }

    @Override
    public void displayCapacity(){
        System.out.println("Battery Capacity: "+capacity);
    }

    public void displayInfo(){
        displayModel();
        displayCapacity();
    }
}

class TTesla extends Electric_Car {
    TTesla(String model, int capacity){
        super(model, capacity);
    }

    @Override
    public void displayModel(){
        System.out.println("Tesla Model: "+model);
    }

    @Override
    public void displayCapacity(){
        System.out.println("Battery Capacity: "+capacity);
    }

    public void displayInfo(){
        displayModel();
        displayCapacity();
    }
}


