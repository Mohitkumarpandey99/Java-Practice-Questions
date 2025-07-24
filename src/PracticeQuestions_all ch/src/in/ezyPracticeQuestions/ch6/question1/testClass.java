package PracticeQuestions_all;

public class testClass {
    public static void main(String[] args) {
        Car car = new Car("white","land ","mohit","evoque");
        car.setColour("Black");
        car.setBrand("Land Rover");
        car.setModel("velar");
        car.setOwnerName("Mohit Kumar Pandey");
        System.out.println(car.toString());
         car.congo();
      //  System.out.println(car.getBrand()+car.getModel()+car.getColour()+car.getOwnerName());

    }

}
