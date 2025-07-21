import java.util.Scanner;

public class reversingdigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to digit reverser");
        System.out.print("enter the number to reverse: ");
        int num  = input.nextInt();
        int ans = reverser(num);
        System.out.println("reversed no is = "+ans);

    }
    public static int reverser (int a){
        int reversed = 0;
        while (a>0) {
            reversed = reversed * 10 + a % 10;;
        a = a / 10;
    } 
    return reversed;
        }
        
}
