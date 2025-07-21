package PracticeQuestions_all;

import java.util.Scanner;

//revisionQuestions
public class HelloUserNamerPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome to user name printer\n plz enter your name:");
        String userName = input.nextLine();
        System.out.printf("Welcome %s ",userName);
    }

}
