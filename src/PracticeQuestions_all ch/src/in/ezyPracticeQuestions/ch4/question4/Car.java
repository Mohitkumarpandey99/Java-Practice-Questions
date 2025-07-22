package PracticeQuestions_all;

public class Car {
    private String brand ;
    private  String model;
    private String ownerName;
    private String price;
    private String colour;

    public Car(String brand, String model, String ownerName, String price, String colour) {
        this.brand = brand;
        this.model = model;
        this.ownerName = ownerName;
        this.price = price;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", price=" + price +
                ",colour="+ colour+
                 '}';
    }
}
