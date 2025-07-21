import java.util.Scanner;

public class p_challange63 {
    public static void main(String[] args) {
        System.out.println("Welcome to array greater number checker:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = input.nextInt();
        int[] arr = new int[size];
        int i = 0;
        while (i<size) {
            System.out.println("enter the element number"+(i+1)+":");
            arr[i]= input.nextInt();
            i++;
        }
        int maxvalue = greatest_checker(arr);
        System.out.println("the maximum number in your array is "+maxvalue);
    }
        public static int greatest_checker(int[]numarr){
            int max = Integer.MIN_VALUE;
            for (int i : numarr) {
                if (max<i) {
                    max = i;
                }
            }
              return max;
        }
    }

