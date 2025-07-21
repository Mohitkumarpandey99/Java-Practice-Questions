import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to armstrong number checker");
        System.out.println("enter your number");
        int num = input.nextInt();
        boolean isarmstrong = isarmstrong(num);
        if (isarmstrong) {
            System.out.println("your no is armstrong number");
        } 
        else{
            System.out.println("not a armstrong number");
        }
    }
    public static boolean isarmstrong(int num){
        int totaldigits = returning_digits(num);
        int numcopy = num;
        int finalno = 0;
        while (num>0) {
            int lastdigit = num % 10;
            num = num / 10;
            finalno += pow(lastdigit,totaldigits);
        }
            return finalno == numcopy;

    }
    public static int returning_digits(int num){
        int digits = 0;
        while (num > 0) {
            digits++;
             num /= 10;
        }
       return digits;
    }
    public static int pow(int num1,int num2){ //num 1 is the number and num to is theno of digits
    int result = 1;
    int i = 0;
    while (i < num2) {
        result = result*num1;
        i++;
    }
    return result;
}
}