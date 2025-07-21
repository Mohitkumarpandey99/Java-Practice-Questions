import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibonacci series printer");
        System.out.println("enter the no till where you want to print the fibonacci series");
        int num = input.nextInt(); 
        System.out.print("here is the fibonacci series upto "+num+":");
        fibonacci(num);

    }
    public static void fibonacci(int num){
        if(num < 0) return;
       System.out.print("0 ");//hardcoded
        if(num ==  0)return;
        System.out.print("1 ");//jardcoded
            
        
        int prev = 0,next = 1;
        while (prev + next<=num) {
            int third = prev + next ; 
            System.out.print(third+" ");
            prev = next;
            next = third;
        }
    }
}
