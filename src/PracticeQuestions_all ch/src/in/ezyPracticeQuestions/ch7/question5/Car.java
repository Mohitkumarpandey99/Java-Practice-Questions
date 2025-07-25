package PracticeQuestions_all;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car Started...vroom...vroom...vroom");
    }

    @Override
    public void stop() {
        System.out.println("Car Stoped...bushhhhhh..");
    }
}
