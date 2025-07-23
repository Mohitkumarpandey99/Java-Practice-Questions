package PracticeQuestions_all;

import java.util.Scanner;
//reversing and palindrome cathcher
public class reversing_a_string {
    public static void main(String[] args) {
        System.out.println("Welcome to reversing String!!");
        System.out.println("enter the string to reverse:");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String reversedStr = reversing(str);
        System.out.println("Here is your reversed string: "+reversedStr);
        if (str.equals(reversedStr)){
            System.out.println("This string is a palindrome!! ");
        }else {
            System.out.println("not palindrome");
        }
    }
    public static String reversing(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
             reversed += str.charAt(i);
        }
        return reversed;
    }
}
