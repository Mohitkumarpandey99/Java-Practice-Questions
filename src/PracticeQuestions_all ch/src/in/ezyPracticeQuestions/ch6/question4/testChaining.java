package PracticeQuestions_all;

public class testChaining {
    public static void main(String[] args) {
        Child child1 = new Child(); //calls both default constructor of parent and child
        System.out.println("first obj ends");
        System.out.println("second obj");
        Child child2 = new Child("Mohit"); //calls both argument constructor of parent and child


    }
}
