package PracticeQuestions_all;

import java.util.Scanner;
//revision
public class largestnum {
    public static void main(String[] args) {
        System.out.println("welcome to largest number checker");
        Scanner input = new Scanner(System.in);
        System.out.print("enter the first number!!: ");
        int first = input.nextInt();
        System.out.print("enter the second number!!: ");
        int second = input.nextInt();
        System.out.print("Now enter the third number!!: ");
        int third = input.nextInt();

        if (first>second && first>third){
            System.out.printf("%d is the largest number",first);
        } else if (second>first && second>third) {
            System.out.printf("%d is the largest number",second);
        }else{
            System.out.printf("%d is the largest number",third);
        }
    }
}
