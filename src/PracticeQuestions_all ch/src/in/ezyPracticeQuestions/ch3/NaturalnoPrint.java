package PracticeQuestions_all;

import java.util.Scanner;

public class NaturalnoPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to natural number printer!!");
        System.out.print("enter the number till where you want to print: ");
        int num = input.nextInt();
        for (int i = 1; i <= num ; i++) {
            System.out.print(i+" ");
        }
    }
}
