import java.util.Scanner;

public class driving_license {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to driving license approver");
        System.out.println("plz enter your name and age");
        System.out.print("name = ");
        String name = input.nextLine();
        System.out.print("age = ");
        int age_input = input.nextInt();
        if (age_input>=60) {
            System.out.println(name + " you are a senior citizen and your age is valid for driving");
        }else if (age_input>=18) { 
            System.out.println(name+" your age is "+ age_input+" you are am adult you can drive");
        }else{
            System.out.println(name+" your age is "+ age_input+" you are not ready now!!");
        }
    }
}
