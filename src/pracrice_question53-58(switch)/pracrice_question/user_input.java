import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("good morning Mr "+ name +".");
        System.out.println(name+" also tell me your age");
        int age = input.nextInt();
        System.out.println(name+" your age is "+ age);
    }
}
