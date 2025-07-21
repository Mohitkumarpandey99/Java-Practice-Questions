import java.util.Scanner;

public class sixth_swapping {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to swappig numbers");
        System.out.println("enter first number");
        int a = input.nextInt();
        System.out.println("first no is : " + a);
        System.out.println("enter second number");
        int b = input.nextInt();
        System.out.println("second no is : " + b);

        System.out.println("after swapping:");
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + "b = " + b);
        input.close();
    }
}