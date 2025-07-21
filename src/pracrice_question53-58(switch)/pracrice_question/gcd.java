import java.util.Scanner;

     public class gcd {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("welcome to greatest common divis calculator ");
        System.out.println("enter the first number");
        int first = input.nextInt();
        System.out.println("enter the second number");
        int second = input.nextInt();
        int ans = gcd(first, second);
        System.out.println("the gcd of the two number is"+"= "+ans);
    }
    public static int gcd (int num1 , int num2){ 
     int gcd = 1;
       int i =2;
       int least=least(num1,num2); 
        while (i<=least) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;
       }
     
      
    public static int least(int a,int b) {
        if (a<b) {
            return a;
        }else{
            return b;
        }
    } 
}



