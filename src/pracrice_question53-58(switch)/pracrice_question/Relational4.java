import java.util.Scanner;

public class Relational4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            
        
        System.out.println("Welcome to leap year calculator ");
        System.out.println("enter your year:");
        int year = input.nextInt();
        if ((year % 4 == 0 && year % 100 != 0 )||(year % 400 == 0)){
            System.out.println("this is a leap year");
            
        }else{
            System.out.println("not a leap year");
        }
    }
}
}