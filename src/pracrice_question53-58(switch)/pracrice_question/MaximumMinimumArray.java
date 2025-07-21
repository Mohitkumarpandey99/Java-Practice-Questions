import java.util.Scanner;

public class MaximumMinimumArray {
    public static void main(String[] args) {
        int[] numarr = input_array();
        int max = max(numarr);
        int min = min(numarr);
        System.out.println("the max no in the array is "+max);
        System.out.println("the min no in the array is "+min);

    }
//method
    public static int min(int[]numarray){
        int min = Integer.MAX_VALUE;
        int i = 0;
        while (i<numarray.length) {
            if (min>numarray[i]) {
                min=numarray[i];
            }
            i++;
        }
        return min;
    }
//method
     public static int max(int[]numarray){
       if (numarray.length==0) {
            return Integer.MIN_VALUE;
       }
        int max = numarray[0];
        int i = 1;
        while (i<numarray.length) {
            if (max<numarray[i]) {
                max = numarray[i];
            
            }
            i++;
        }
       return max;   
     }
//method
    public static int[] input_array(){
        System.out.println("welcome to maximum minimum number finder in an array");
        System.out.println("enter the no of elements:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[]arr = new int[size];
        int i = 0;
        while (i<size) {
            System.out.println("enter the element no"+ (i+1) +":");
            arr[i]=input.nextInt();
            i++;
        }
        return arr;
    }
}
