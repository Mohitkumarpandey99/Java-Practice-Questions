package PracticeQuestions_all;

import java.util.Scanner;

public class countingVowels {
    public static void main(String[] args) {
        System.out.println("welcome to vowels counter");
        System.out.print("enter your sentence to check: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int ans = check(str);
        System.out.println("The number of vowels in your string are: "+ans);

    }
    public static int check(String str){
        int counter = 0;
        str = str.toLowerCase();
        for (int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if (ch== 'a'|| ch =='e'||ch =='i'||ch == 'o'||ch =='u'){
                counter++;
            }
        }
        return counter;
    }
}