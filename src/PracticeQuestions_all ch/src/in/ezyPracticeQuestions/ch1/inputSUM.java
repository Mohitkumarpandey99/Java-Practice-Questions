package PracticeQuestions_all;

import java.util.Scanner;

//REVISION OUESTION
public class inputSUM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to sum printer");
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        int sum = first+second;
        System.out.printf("The sum of %d + %d is %d ",first,second,sum);
    }
}
