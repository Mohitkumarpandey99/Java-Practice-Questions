import java.util.Scanner;

public class p_challange68 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to fibonacci series printing");
        System.out.println("enter the number till where to print:");
        int lastnum = input.nextInt();
        for (int i = 1; i <=lastnum; i++) {
             System.out.print(fibonacci(i)+" ");
        
        }
       
    }
    public static int fibonacci (int position){
      if (position == 1 ) {
        return 0;
      }
      if (position == 2) {
        return 1;
      }
      return fibonacci(position-1)+fibonacci(position-2);
    }
}
