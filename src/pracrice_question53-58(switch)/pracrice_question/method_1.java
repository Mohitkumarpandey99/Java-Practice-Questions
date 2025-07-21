import java.util.Scanner;

public class method_1 {

    public static void main(String[] args) {
        print_msg();
        int first = addnumber();
        int second = addnumber();
       int sum = first+second;
        System.out.println("the sum is "+sum);
    }

    public static void print_msg(){
        System.out.println("Welcome to the adder");
    }

    public static int addnumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("enter number :");
        int first = input.nextInt();
        return first;
    
    }
    
}