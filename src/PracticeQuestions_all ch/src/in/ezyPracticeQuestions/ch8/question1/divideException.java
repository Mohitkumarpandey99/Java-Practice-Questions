package PracticeQuestions_all;

import java.util.Scanner;

public class divideException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to divider");
        System.out.println("enter the first number");
        int first = input.nextInt();
        System.out.println("enter the second number");
        int second = input.nextInt();
        double ans = divider(first,second);
        System.out.println("Result is: "+ans);

    }
    public static double divider(int first, int second){
         double divide = 0;
         try {
            divide = first / second; 
         } catch (ArithmeticException e) {
             System.out.println("invalid operation");
             divide = Double.NaN;
         }
        return divide;
    }
}