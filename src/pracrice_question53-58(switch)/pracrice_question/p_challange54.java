import java.util.Scanner;

public class p_challange54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to odd even checker by ternary");
        System.out.println("enter your number to check: ");
        int num = input.nextInt();
        String result = num%2==0 ? "even" : "odd";
        System.out.println("your no is "+result);
        
    }
}
