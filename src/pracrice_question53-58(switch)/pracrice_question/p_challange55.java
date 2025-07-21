import java.util.Scanner;

public class p_challange55 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to absolute num converter ternary");
        System.out.println("enter your number to check: ");
        int num = input.nextInt();
        int result = num>=0 ? num : -num;
        System.out.println("your no is "+result);
}
}