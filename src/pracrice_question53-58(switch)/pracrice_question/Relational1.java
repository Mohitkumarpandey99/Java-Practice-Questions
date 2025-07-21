import java.util.Scanner;

public class Relational1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("welcome to no positive negative checker");
        System.out.print("enter your no:");
        int num = input.nextInt();
        if (num > 0) {
            System.out.println("your input is positive");}
        else if (num < 0) {
        System.out.println("your input is negative");
            
        }else{
            System.out.println("your input is 0");
        }
            
        }
    }
}

