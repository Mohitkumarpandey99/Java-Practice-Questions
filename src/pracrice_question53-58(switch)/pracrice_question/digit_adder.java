import java.util.Scanner;

public class digit_adder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to digit calculator of a number");
        System.out.println("enter the number");
        int num = input.nextInt();
        //int copy = num;
        int ans = digitadder(num);
        System.out.println("the sum of the the number "+num+" is "+ans);
    }
       
public static int digitadder(int a){
 int sum = 0;
        
        while (a>0) {
            sum += a % 10;
            a = a/10;
        }
        return sum;
        
    }
  
}
