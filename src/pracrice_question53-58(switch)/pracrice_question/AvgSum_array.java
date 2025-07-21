import java.util.Scanner;

public class AvgSum_array {
    public static void main(String[] args) {
       int[] numarray = taking_input();
       long sum =sum(numarray);
       int avg = average(numarray);
       System.out.println("the sum of the elements in the array is : "+ sum); 
       System.out.println("The average of the array is : " + avg);
    }


 

    public static long sum(int[] numarray){
        int sum = 0;
        int i = 0;
        while (i<numarray.length) {
           sum = sum + numarray[i];
           i++;
        }
        return sum;

    }
    public static int average(int[] numarray){
      int sum = (int)sum(numarray);
     int avg = sum/numarray.length;
      return avg;
    }


    public static int[] taking_input(){
         Scanner input = new Scanner(System.in);
        System.out.println("welcome to avg sum calculator in an array ");
        System.out.println("Enter the  no of digits:");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i = 0 ;
        while (i<size) {
            System.out.print("enter the element no "+ (i+1) +":");
            nums[i]=input.nextInt();
            i++;
            
        }
        return nums; 
    }
}
