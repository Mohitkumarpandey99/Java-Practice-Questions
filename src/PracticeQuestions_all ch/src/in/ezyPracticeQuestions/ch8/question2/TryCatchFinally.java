package PracticeQuestions_all;

import java.util.Scanner;

public class TryCatchFinally {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("welcome to divider");
        System.out.println("enter the first number");
        double first = input.nextInt();
        System.out.println("enter the second number");
        double second = input.nextInt();
        double ans = divider(first, second);
        System.out.println("Result is: " + ans);

    }

    public static double divider(double first, double second) {
        double result = 0;
        try {
          result = first / second;

        }catch (ArithmeticException exception){
            System.out.println("cant be divided by Zero");
            result = Double.NaN;
        }finally {
            System.out.println("this block will always be executed");
        }
        return result;
    }
}


