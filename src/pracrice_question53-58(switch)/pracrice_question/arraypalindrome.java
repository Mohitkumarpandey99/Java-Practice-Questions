import java.util.Scanner;

public class arraypalindrome {
    public static void main(String[] args) {
        int[] numarray = input_array();
        boolean ispalindrome = ispalindrome(numarray);
        if (ispalindrome) {
            System.out.println("your array is palindrome");
        }else{
            System.out.println("your array is not palidrome");
        }

    }
    public static boolean ispalindrome(int[]numarray) {
        int i = 0;
        while (i<numarray.length/2) {
            if (numarray[i]!=numarray[(numarray.length-1)-i]) {
              return false;  
            }
            i++;
        }
        return true;
    }
    public static int[] input_array(){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Array Palindrome checker");
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        int[]arr =new int[size];
        int i = 0;
        while (i<size) {
            System.out.print("Enter the element no "+(i+1)+": ");
            arr[i]= input.nextInt();
            i++;
        }
        return arr;
    }
}
