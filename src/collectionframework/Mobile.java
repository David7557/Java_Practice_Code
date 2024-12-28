package collectionframework;

public class Mobile {
    String brand;
    String color;
    double price;

    Mobile(String brand, String color, double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Brand: "+brand+" Color: "+color+" Price: "+price;
    }
}
