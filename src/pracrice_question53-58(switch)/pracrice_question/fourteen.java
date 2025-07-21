import java.util.Scanner;

public class fourteen {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temperature in fahrenheit :");
        int temp_fahrenheit = input.nextInt();
        int temp_celsius = (temp_fahrenheit - 32)*5/9;
        System.out.println("temperature in  celsius is : "+ temp_celsius);
        
    }
}
