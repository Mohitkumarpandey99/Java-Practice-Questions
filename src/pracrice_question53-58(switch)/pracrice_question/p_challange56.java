import java.util.Scanner;

public class p_challange56 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to marks callasification by  ternary");
        System.out.println("enter your marks to check: ");
        int marks = input.nextInt();
        String category = marks>80 ? "High" : (marks>50) ? "moderate" : "low";
        System.out.println("your marks is in "+ category+" category");
}
}
