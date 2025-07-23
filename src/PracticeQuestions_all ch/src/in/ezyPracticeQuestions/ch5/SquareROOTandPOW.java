package PracticeQuestions_all;

import java.util.Scanner;

public class SquareROOTandPOW {
    public static void main(String[] args) {
        System.out.println("welcome to Square root and power calculator");
        System.out.println("enter the number whose squareRoot to and power to calculate:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        System.out.print("now enter the power of your number:");
        int pow = input.nextInt();

        double sqr = sq(num);
        System.out.printf("SquareRoot of your number is: %.2f ",sqr);
        double power = pow(num,pow);
        System.out.printf("and the power is: %.2f ",power);
    }
    public static double sq(int num){
        double sq = Math.sqrt(num);
        return sq;
    }
    public static double pow(int num,int pow){
        double power = Math.pow(num,pow);

        return power;
    }
}
