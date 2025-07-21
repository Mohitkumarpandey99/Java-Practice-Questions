import java.util.Scanner;

public class Bitwise_Xor {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
        
    //both bits should be different for result 1 otherwise it will give 0
    System.out.println("welcome to bitwise XOR operator showcasing");
    System.out.print("enter first number:");
    int first = input.nextInt();
    System.out.println("enter the second number");
    int second = input.nextInt();

    int result = first ^ second;
    System.out.println("Result is: "+result);
   } 
}
}
