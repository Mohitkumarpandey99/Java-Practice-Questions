package PracticeQuestions_all;

import java.util.Scanner;

public class TablePrinter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to table printer!!");
        System.out.print("Enter the number whose table you want print: ");
        int num = input.nextInt();
        for (int i = 1; i <=10 ; i++) {
            int product = num * i;
            System.out.printf("\n%d X %d = %d ",num,i,product);
        }

    }
}
