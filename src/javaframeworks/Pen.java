package javaframeworks;

public class Pen {
    String brand;
    int cost;

    Pen(String brand, int cost){
        this.brand = brand;
        this.cost = cost;
    }

    @Override
    public String toString(){
        return "Brand: "+brand+" Cost: "+cost;
    }

}
