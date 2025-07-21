
import java.util.Scanner;

public class p_challange59 {
    public static void main(String[] args) {
         
          int password = 123; 
          int input1;
        do{  
             Scanner input = new Scanner(System.in);
        System.out.println("enter password:");
         input1 = input.nextInt();
         if (input1!=password) {
             System.out.println("incorrect password retry!!");
         }
        
       
        }while(input1!=password);

       System.out.println("password is correct welcome user");
       
    }
  
}
