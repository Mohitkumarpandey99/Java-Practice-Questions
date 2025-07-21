import java.util.Scanner;

public class check1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Discount Calculator");

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        input.nextLine(); // Consume leftover newline

        boolean isFemale = false;

        if (age >= 5) {
            System.out.print("Are you female? Enter (yes/no): ");
            String genderInput = input.nextLine();
            isFemale = genderInput.equalsIgnoreCase("yes");
        }

        if (age < 5) {
            System.out.println("You got 75% discount on your ticket.");
        } else if (isFemale) {
            System.out.println("You got 50% discount on your ticket.");
        } else if (age > 60 && !isFemale) {
            System.out.println("You got 25% discount on your ticket.");
        } else {
            System.out.println("Sorry, there are no discounts for this age segment.");
        }

        input.close();
    }
}

