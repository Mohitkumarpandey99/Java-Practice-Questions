import java.util.Scanner;

public class factorial_practice {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("enter the  no whose factorial u want to calculate");
        int num = input.nextInt();
       long ans =factorial(num);
        System.out.println("the factorial of "+ num + "is ="+ ans );
    }
        
public static long factorial(int a){
long factorial = 1;
        int i = 1;  
        while (i<=a) {
            factorial *=i;
            i++;   
        }
       
        return factorial;
    }

}
