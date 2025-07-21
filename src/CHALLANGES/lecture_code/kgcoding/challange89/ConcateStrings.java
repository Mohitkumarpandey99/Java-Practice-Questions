package CHALLANGES.lecture_code.kgcoding.challange89;

import java.util.Scanner;
//varargs
public class ConcateStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to String concating");
        System.out.println("enter str1");

        String string1 = input.nextLine();
        System.out.println("enter str2");
        String string2 = input.nextLine();
        System.out.print(Concate(string1));
        System.out.print(Concate(string2));
        System.out.print(Concate("mohit is"));
        System.out.print(Concate("HERE"));
        System.out.print(Concate("ON THE KEYBORD"));

    }
    public static String Concate(String...strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();

    }
}
