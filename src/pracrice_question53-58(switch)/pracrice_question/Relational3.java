import java.util.Scanner;

public class Relational3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("Welcome to the greater no checker");
        System.out.println("enter first no to continue or 0 to exit");
        int first = input.nextInt();
          if (first==0) {
            System.exit(0);
        } 
        System.out.println("enter second number");
        int sec = input.nextInt();
        System.out.println("enter third number");
        int third = input.nextInt();

         if (first>sec && first>third) {
            System.out.println(first+" is the greatest num among all");
        }
        else if (sec>first && sec>third) {
            System.out.println(sec+" is greater among all");
        }

           else {
            System.out.println(third+" is greater among all");
            
        }
    }


}
    }


