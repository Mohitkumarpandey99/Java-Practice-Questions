package PracticeQuestions_all;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the file name:");
       String filename =  input.nextLine();
        Show sc = new Show(filename);
        sc.printing();
    }


}
