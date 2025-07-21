package PracticeQuestions_all;

import java.util.Scanner;



//revision question
public class AreaOfaCIRICLE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the radius of your circle!!");
        double radius = input.nextDouble();
        if (radius < 0){
            System.out.println("invalid operation");
            return;
        }
        double area = Math.PI * Math.pow(radius,2);
        System.out.printf("the area of the circle is %.2f",area);
    }
}
