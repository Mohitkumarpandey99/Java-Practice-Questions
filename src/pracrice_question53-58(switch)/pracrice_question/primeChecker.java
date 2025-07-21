import java.util.Scanner;
//prime nos means nos that are divide by 1 and by itself
public class primeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to prime checker");
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean ans = prime_checker(num);
        if (ans) {
            System.out.println("this is prime number");
        }else{
            System.out.println("not a prime number");
        }

    }
    public static boolean prime_checker(int a){
      
        if (a<2) {
        return false;
        }

        int i = 2;
        while (i < a) {
            if (a % i == 0) {
            return false;
            }
            i++;
        }
    return true;
}
} 
