package CHALLANGES.lecture_code.kgcoding.challange111;

import java.util.Scanner;
import java.util.stream.IntStream;

public class FactorialProcedural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to factorial printing");
        System.out.print("enter the number whose factorial you want to calculate : ");
        int ans = factorial(input.nextInt());
        System.out.print("enter the value for functional programming :");
        int num = input.nextInt();
        System.out.println("factorial of your number is "+ans);

        //functional programming
        System.out.print("factorial value by functional programming:");
        IntStream.rangeClosed(2,num)
                .reduce((a,b)->a*b)
                .ifPresent(System.out::print);

    }
    //procedural programming
    public static int factorial(int num){

        if (num == 0 || num == 1){
            return 1;
        }
        int result=1;
        for (int i = 2; i <=num ; i++) {
            result *= i;
        }
        return result;
    }
}

