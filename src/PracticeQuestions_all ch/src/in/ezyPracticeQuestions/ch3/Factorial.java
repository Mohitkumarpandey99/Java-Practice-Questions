package PracticeQuestions_all;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("welcome to factorial printer");
        System.out.print("enter the number whose factorial you want: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        long  ans = factorial(num);
        System.out.println("factorial is: "+ans);

    }
    public static long factorial(int num){
        if (num<=1){
             return 1;
        }
        long sum = 1;
        for (int i = 2; i <=num ; i++) {
        sum *= i;
        }
        return sum;
    }
}
