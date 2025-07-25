package PracticeQuestions_all;

import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**Welcome to area calculator of shapes**");
        System.out.print("enter the radius of your circle: ");
        double radius = input.nextDouble();
        input.nextLine();
        Circle cir = new Circle();

        System.out.print("Enter the radius of sides of your square:\n");
        double sideLen = input.nextDouble();
        System.out.println("press 1 and enter to get the answers");

        input.nextLine();
        Square sqr = new Square();

        System.out.printf("The Area of your Square is: %.2f%n",sqr.area(sideLen));
        System.out.printf("The area of your Circle is : %.2f%n",cir.area(radius));

    }
}
