import java.util.Scanner;

public class discount_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to discount calculator");
        System.out.print("enter your age: ");
        int age = input.nextInt();     

        
            System.out.println("Are you a female enter:(true/false))");
           boolean isfemale = input.nextBoolean();
        

        if (age < 5) {
            System.out.println("you got 75% discount on your ticket.");
        } else if (isfemale) {
            System.out.println("you got 50% discount on your ticket");
        } else if (age > 60 && !isfemale) {
            System.out.println("you got 25% discount on your ticket");
        } else {
            System.out.println(" 'Sorry' there are no discounts for this age segment");
        }
    }

}
