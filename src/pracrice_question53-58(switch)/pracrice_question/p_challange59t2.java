import java.util.Scanner;

public class p_challange59t2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to password validity checker");
        String password;
        do{
            System.out.println("enter your password!!");
            password = input.nextLine();
        }while(!isvalid(password));
        
        System.out.println("thanks for entering valid password");
        
    }
    public static boolean isvalid(String password){
        return password.length()>6;
    }
}
