package PracticeQuestions_all;

public class Test {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Bike bike = new Bike();

        car.start();
        bike.start();

        bike.refule(); // accesing bike own method not define in the Vehical interface

        car.stop();
        bike.stop();
    }


}
