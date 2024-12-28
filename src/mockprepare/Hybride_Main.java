package mockprepare;
class Vehicle{
    private String brand;
    Vehicle(String brand){
        this.brand = brand;
    }
    public void displayBrand(){
        System.out.println("Brand: "+brand);
    }
}

class Car extends Vehicle{
    private String model;
    Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    public void displayModel(){
        System.out.println("Model: "+model);
    }
}

interface Electric {
    void displayBatteryCapacity();
}

class ElectricCar extends Car implements Electric{
    private int batteryCapacity;
    ElectricCar(String brand, String model, int batteryCapacity){
        super(brand, model);
        this.batteryCapacity=batteryCapacity;
    }

    @Override
    public void displayBatteryCapacity(){
        System.out.println("Battery Capacity: "+batteryCapacity);
    }

    public void displayInfo(){
        displayBrand();
        displayModel();
        displayBatteryCapacity();
    }

}


public class Hybride_Main {

    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model5", 100);
        tesla.displayInfo();
    }
}
