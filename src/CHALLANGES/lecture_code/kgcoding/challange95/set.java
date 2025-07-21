package CHALLANGES.lecture_code.kgcoding.challange95;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<Character>unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("enter your string:");
        String userstring = input.next();
        for (char ch : userstring.toCharArray()) {
            unique.add(ch);
        }
        System.out.printf("your string has %d unique character",unique.size());
    }
}

