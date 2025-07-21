import java.util.Scanner;

public class p_challange61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to table printer (for loop)");
        System.out.print("enter the no whose table you want to print:");
        int num = input.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(num+" X "+i+" = "+ (num*i) );
        }
    }
}
