package PracticeQuestions_all;

import java.util.Scanner;

public class ConstantVowelcheck {
    public static void main(String[] args) {
        System.out.println("Welcome to constant vowel checker");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character to check: ");
        char ch = input.next().charAt(0);
        ch = Character.toLowerCase(ch);

        if (!Character.isLetter(ch)){
            System.out.println("invalid input enter character");
        }
        else if (ch == 'a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
            System.out.println("this is a vowel");
        }
        else{
            System.out.println("your character is constant");
        }
    }
}
