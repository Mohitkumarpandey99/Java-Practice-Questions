import java.util.Scanner;

public class Relational2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
        System.out.println("welcome to odd even checker");
        System.out.println("enter your number");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println(num+" is even number");
        }
        else{
            System.out.println(num+ " is odd number");
        }
    }
}
}
