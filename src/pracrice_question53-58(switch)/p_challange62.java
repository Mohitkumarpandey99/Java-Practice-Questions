import java.util.Scanner;

public class p_challange62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to prime checker");
        System.out.println("Enter the number to check:");
        int num = input.nextInt();
        boolean isprime = isprime_checker(num);
        if (isprime) {
            System.out.println("this is a prime number!!");
        }else{
            System.out.println("not a prime number!!!");
        }
    }
    public static boolean isprime_checker(int num){
        if (num<2) {
            return false;
        }
        for(int i = 2; i < num; i++){
        if (num % i == 0) {
            return false;
        }
        }
         return true;
    }
}
