import java.util.Scanner;

public class summingodd_practice {
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd no calculator");
        System.out.println("enter the no till where to sum");
        int n = input.nextInt();
        
        int c = oddSum(n);
        System.out.println("the sum is = "+ c);
      }
       
public static int oddSum(int a){
 int sum = 0;
         int i = 1;
        while (i<=a) {
          if (i%2!=0) {
            sum+=i;
          }
          i++;
        }
         
       return sum;

    }


}