package PracticeQuestions_all;

public class testOverloading {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        System.out.println("first method ");
        car.printDetails("black","Mohit kumar pandey");

        System.out.println("over loaded method");
        car2.printDetails("yellow",4);
    }
}
