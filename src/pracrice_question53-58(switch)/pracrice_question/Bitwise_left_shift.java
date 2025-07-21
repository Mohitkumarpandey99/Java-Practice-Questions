import java.util.Scanner;

public class Bitwise_left_shift {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
        
    
    System.out.println("welcome to bitwise left shift operator showcasing");
    System.out.print("enter first number:");
    int first = input.nextInt();
    
    int result = first<<4;//4 times multiplying the given number by 2 can be used in a program which says to calculate power of 2
    System.out.println("Result is: "+result);
   } 
}
}