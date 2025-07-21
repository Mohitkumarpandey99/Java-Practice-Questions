import java.util.Scanner;

public class add {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the world of adding");
        System.out.println("enter first num:");
        int first = input.nextInt();
        System.out.println("enter second no:");
        int second = input.nextInt();
        //System.out.println("sum of your no is: ");
        int sum = first + second;
        System.out.println("your sum is:"+sum);
    }
}
