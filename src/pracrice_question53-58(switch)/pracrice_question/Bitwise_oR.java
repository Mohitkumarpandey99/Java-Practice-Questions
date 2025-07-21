import java.util.Scanner;

public class Bitwise_oR {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
        
    
    System.out.println("welcome to bitwise OR operator showcasing");
    System.out.print("enter first number:");
    int first = input.nextInt();
    System.out.println("enter the second number");
    int second = input.nextInt();

    int result = first | second;
    System.out.println("Result is: "+result);
   } 
}
}