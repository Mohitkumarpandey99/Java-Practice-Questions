import java.util.Scanner;

public class p_challange65 {
    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        System.out.println("welcome to exitter");
        while (true) {
            System.out.println("enter command (exit) to close");
            String command = input.nextLine();
            if (command.equals("exit")) { //can use .equalignorecase to ignore string casing
                break;
            }
        }  
        System.out.println("exitted");  
        } 
    }

