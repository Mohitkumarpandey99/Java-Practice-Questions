import java.util.Scanner;

public class practice_bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        while (true) {
            
        System.out.println("welcome to odd even checker");
        System.out.println("enter your number");
        int number = input.nextInt();
        
        if ((number & 1) == 0) {
            System.out.println("this is an even number");
            
        } else {
            System.out.println("this is a odd number");
        }
    }
}
}
