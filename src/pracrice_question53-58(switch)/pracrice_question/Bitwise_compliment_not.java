import java.util.Scanner;

public class Bitwise_compliment_not {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("showcasing not/compliment operator");
        System.out.println("enter your number");
        int num = input.nextInt();

        int result = ~num;
        System.out.println("Result is "+result);

    }
}
