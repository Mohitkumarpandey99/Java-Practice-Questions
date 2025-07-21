import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to palindrome checker ");
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean ispalindrome = ispalindrome(num);
        if (ispalindrome) {
            System.out.println("This is a palindrome number");
        }else{
            System.out.println("not palindrome");
        }

    }
    public static boolean ispalindrome(int num){
        int newnum = 0;
        int numcopy = num;
     while (num > 0) {
       int palindrome = num % 10;
       newnum = newnum * 10 + palindrome;
     num = num/10; 
     }
    return newnum == numcopy;
    }
}
