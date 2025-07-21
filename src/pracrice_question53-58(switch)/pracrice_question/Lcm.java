import java.util.Scanner;

public class Lcm {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("welcome to lcm calculator ");
        System.out.println("enter the first number");
        int first = input.nextInt();
        System.out.println("enter the second number");
        int second = input.nextInt();
        int ans = lcm(first, second);
        System.out.println("the lcm  of the two number is"+"= "+ans);
    }
    public static int lcm(int first, int second){
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
} 