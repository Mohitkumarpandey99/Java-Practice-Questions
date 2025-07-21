import java.util.Scanner;
//53
public class p_challange53 {
    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("welcome to greater number checker");
     System.out.println("enter the first number");
     int firstNum = input.nextInt();
     System.out.println("enter second number:");
     int secNum = input.nextInt();
     p_challange53 minimum = new p_challange53();
     int min = minimum.min(firstNum,secNum);
     System.out.println(min+" is smaller");
    }
     public int min(int num1,int num2){
     return num1<num2?num1:num2;
    }
}

