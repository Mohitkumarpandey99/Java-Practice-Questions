import java.util.Scanner;

public class p_challange69 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to palindrome checker using recursion");
        System.out.println("enter the string");
        String name = input.nextLine();
        System.err.println("your string is"+((ispalindrome(name)?"palindrome"
                                                                :"not palindrome")));

    }
    public static boolean ispalindrome(String str){
        if (str.length()<=1) {
            return true ;
        }
        int lastpos = str.length()-1;
        if (str.charAt(0)!=str.charAt(lastpos)) {
            return false;
        }
        String newstr = str.substring(1, lastpos);
        return ispalindrome(newstr);
        
    }
}
