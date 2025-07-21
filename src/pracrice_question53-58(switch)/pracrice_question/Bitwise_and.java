import java.util.Scanner;

public class Bitwise_and {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("show casing bitwise AND operator");
        System.out.println("enter first number:");
        int first = input.nextInt();
        System.out.println("now enter the second number:");
        int second = input.nextInt();

        int result = first & second;
        System.out.println("result is:"+ result);
    }
}
}