import java.util.Scanner;

public class Rightshift {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    while (true) {
        
    
    System.out.println("welcome to bitwise right shift operator showcasing");
    System.out.print("enter first number:");
    int first = input.nextInt();
    int result = first>>2;//every no is getting divided by 2 if 1 times shift if more than dividing no incses
    System.out.println("Result is: "+result);
   } 
}
}

