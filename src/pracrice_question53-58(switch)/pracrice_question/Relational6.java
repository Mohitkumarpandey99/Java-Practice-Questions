import java.util.Scanner;

public class Relational6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Welcome to age cetogizer");
            System.out.println("Enter your age:");
            int age = input.nextInt();

            if (age < 13) {
                System.out.println("you are a child");

            } else if (age < 20) {
                System.out.println("you are a teen");

            } else if (age < 60) {
                System.out.println("you are a adult");

            } else {
                System.out.println("you are senior ");
            }
        }
    }
}
