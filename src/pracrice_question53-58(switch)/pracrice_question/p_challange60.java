import java.util.Scanner;

public class p_challange60 {
    public static void main(String[] args) {
        System.out.println("Welcome to number guessing number!!");
        int num = 23;
        int guess;
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("guess the right number");
            guess = input.nextInt();
        }while(num != guess);
        System.out.println("congratulations you have guessed the number "+"the no is:"+num);
    }
}
