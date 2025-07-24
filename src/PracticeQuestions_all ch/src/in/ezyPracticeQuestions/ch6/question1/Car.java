package PracticeQuestions_all;

public class Car {
    private String colour;
    private  String brand;
    private  String ownerName;
    private  String model;

    public void congo () { //non static depends on object
        System.out.println("congratulations Mr " + ownerName + " for your brand new " + model);
    }
    public Car(String colour, String brand, String ownerName, String model) {
        this.colour = colour;
        this.brand = brand;
        this.ownerName = ownerName;
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    }

