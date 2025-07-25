package PracticeQuestions_all;

import java.util.Scanner;

public class Square extends Shape{
    Scanner input = new Scanner(System.in);
    double sidesLenth = input.nextDouble();

    @Override
    public double area(double sidesLenth) {
        double area = Math.pow(sidesLenth,2);
        return area;
    }
}
