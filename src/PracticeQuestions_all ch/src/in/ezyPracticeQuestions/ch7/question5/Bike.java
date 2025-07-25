package PracticeQuestions_all;

public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike started....drommmm..droommmm");
    }

    @Override
    public void stop() {
        System.out.println("Bike stoped....dushhhhhh...");
    }
    public void refule(){
        System.out.println("Bike is refuleing");
    }
}
