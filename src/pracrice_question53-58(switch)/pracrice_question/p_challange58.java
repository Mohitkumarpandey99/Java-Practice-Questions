import java.util.Scanner;

public class p_challange58 {

    public static void main(String[] args) {
        int num1;
        int num2;
        int result=0;
        while (true) {
            
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to simple calculator ");
        System.out.println("choose an operation to perform");
        System.out.println("1.add");
        System.out.println("2.subtract");
        System.out.println("3.multiply");
        System.out.println("4.division");
        System.out.println("5.to exit");
        System.out.println("Now enter your choice");
        int choice = input.nextInt();
        if (choice != 5 && choice <5) {
            System.out.print("enter first number:");
        num1= input.nextInt();
         System.out.print("enter second number:");
        num2 = input.nextInt();
        
    
        switch (choice) {
            case 1:
               result=num1 + num2;
                break;

                 case 2:
               result=num1 - num2;
                break;

                 case 3:
               result=num1 * num2;
                break;

                 case 4:
                 p_challange58 division = new p_challange58();
               result= division.division(num1, num2);
                break;

               //  case 5:
               //   System.exit(0);
               // break;
        
           // default:System.out.println("invalid input plz choose frm the menu");
               // break;
                
        }
    
        
        int ans = result;
        System.out.println("ans is "+ans);
    }else{
        System.out.println("invalid input retry entering input frm menu");
        return;
    }
}
    
}
    public int division(int num1,int num2){
      if (num2==0) {
        System.out.println("invalid operation");
      }
    
      return num1 / num2;
    
    } 
    
}
