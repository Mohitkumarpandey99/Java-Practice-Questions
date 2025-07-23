package PracticeQuestions_all;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        System.out.println("Welcome to Prime checker!!");
        System.out.println("Enter the number to check");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (primeCheck(num)){
            System.out.println("your number is prime!!");
        }else{
            System.out.println("your number is not a prime number!!");
        }

    }
    public static boolean primeCheck(int num){
        for (int i = 2; i < num ; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
