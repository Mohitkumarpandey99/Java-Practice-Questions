import java.util.Scanner;

public class reversingarray {
    public static void main(String[] args) {
      int [] numarray =  input_arr();
      reversingArray(numarray);
      System.out.println("your reversed array is: ");
      display_array(numarray);
    }

    public static void reversingArray(int[]numarray){
        int i = 0;
        while (i<numarray.length/2) {
            int swap = numarray[i];
            numarray[i]=numarray[(numarray.length-1)-i];
             numarray[(numarray.length-1)-i] = swap;        
            i++;
        }

    }

    public static int[] input_arr(){
        Scanner input = new Scanner(System.in);
System.err.println("welcome to array swapping");
System.out.println("enter the size of the array: ");
int size = input.nextInt();
int[]arr = new int[size];
int i = 0;
while (i<size) {
    System.out.println("enter the element no "+ (i+1) +":");
    arr[i]=input.nextInt();
    i++;
}
return arr;
    }
    public static void display_array(int[]numarray){
        int i = 0;
        while (i<numarray.length) {
            System.out.println(numarray[i]+" ");
            i++;  
        }
        System.out.println();
    }
}
