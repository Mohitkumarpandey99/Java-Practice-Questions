import java.util.Scanner;

public class p_challange66 {
    public static void main(String[] args) {
       
        System.out.println("welcome to positive number sum calculator");
      int[]arr=input_arr();
     int i = 0;
     int sum = 0;
     while (i<arr.length) {
        if (arr[i]<0) {
            i++;
            continue;
        }
       sum+=arr[i];
       i++;
       
     }
     System.out.println("the sum is "+sum);
        
    }
    public static int[] input_arr(){
         Scanner input = new Scanner(System.in);
            System.out.println("enter the size of the array!!");
       int size = input.nextInt();
       int[]arr = new int[size];
       int i = 0;
       while (i<size) {
        System.out.println("enter the element number"+(i+1)+":");
        arr[i]=input.nextInt();
        i++;
       }
        return arr;
    }
}
