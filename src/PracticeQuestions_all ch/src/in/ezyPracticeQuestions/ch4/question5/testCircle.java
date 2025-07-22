package PracticeQuestions_all;

import java.util.Scanner;

public class testCircle {
    public static void main(String[] args) {
        System.out.println("Welcome to Circumference printer of a Circle");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the radius of your Circle: ");
        double radius = input.nextDouble();
        Cricle cir = new Cricle(radius);
      double ans = cir.circumference();
        System.out.printf("the circle circumfrence is %.2f: ",ans);
    }
}
