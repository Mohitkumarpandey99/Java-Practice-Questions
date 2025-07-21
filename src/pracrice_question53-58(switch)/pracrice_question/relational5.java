import java.util.Scanner;

public class relational5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Welcome to grades calculator");
            System.out.println("enter your percentage ");
            int percentage = input.nextInt();
            if (percentage > 90) {
                System.out.println("grade = A");
                System.out.println("excellent!! keep it up");
            } else if (percentage > 75) {

                System.out.println("grade = B");
                System.out.println("Very good!! keep it up");
            } else if (percentage > 60) {

                System.out.println("grade = C");
                System.out.println("You can do better!!");
            } else if (percentage > 30) {

                System.out.println("grade = D");
                System.out.println("it's time to do a comeback bro");
            } else {
                System.out.println("grade = F(FAIL)");
                System.out.println("PDHLE BHAIIIIII");
            }
        }
    }
}
