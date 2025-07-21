package PracticeQuestions_all;

import java.util.Scanner;

public class decimalTObinary {
    public static void main(String[] args) {
        System.out.println("welcome to decimal to binary number converter!!");
        System.out.println("enter your number");
        Scanner input = new Scanner(System.in);
        int decimal = input.nextInt();

        int num = decimal;
        String binary = "";

        if (decimal == 0){
            binary="0";

        }else{
            while (num > 0){
                int remainder = num % 2;
                binary = remainder+binary; // we are storing the remainder in binary (concating)
               num = num / 2;

            }
            System.out.printf("The Binary form of %d is %s",decimal,binary);
        }
    }
}
