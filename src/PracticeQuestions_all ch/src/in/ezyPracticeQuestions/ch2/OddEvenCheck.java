package PracticeQuestions_all;

import java.util.Scanner;
//revision
public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even checker");
        System.out.println("Enter The Number To Check");
        int number = input.nextInt();
        if (number % 2 == 0){
            System.out.println("this is an even number!!");
        }else{
            System.out.println("this is a odd number!!");
        }
    }
}
