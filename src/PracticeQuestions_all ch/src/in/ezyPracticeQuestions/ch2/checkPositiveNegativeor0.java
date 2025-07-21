package PracticeQuestions_all;

import java.util.Scanner;

public class checkPositiveNegativeor0 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to num positive/negative/0 Checker");
        System.out.print("Enter the number to check!!: ");
        int num = input.nextInt();
        if (num<0){
            System.out.println("Number is negative!!");

        } else if (num > 0 ) {
            System.out.println("Number is positive!!");
        }else {
            System.out.println("number is 0 ");
        }
    }
}
