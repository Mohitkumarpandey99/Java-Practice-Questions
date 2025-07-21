import java.util.Scanner;

public class SortedArray_checking {
    public static void main(String[] args) {
    int[]numarr =  input_array();
    boolean isinc = isincreasing(numarr);
    boolean isdec = isdecreasing(numarr);
    if ( isinc || isdec){
        if (isinc) {
            System.out.println("sorted in increasing");
        }else{
            System.out.println("sorted in decreasing");
        }
        System.out.println("your array is sorted");  
    }else{
        System.out.println("your array is not sorted");
     } 

    }
    
    public static boolean isincreasing(int[]numarray){
        int i = 1;
        while (i<numarray.length) {
            if (numarray[i]< numarray[i-1]) { //i kya chhota hai i - 1 se agar hai to not sorted
                return false;                 // ex = i = 38 and i -1 = 44
            }i++;                              //ex =  44,38.......(not sorted)
        }
        return true;
    }

     public static boolean isdecreasing(int[]numarray){
        int i = 1;
        while (i<numarray.length) {
            if (numarray[i]>numarray[i-1]) { // i kya bda hai i - 1 se
                return false;                  //ex i = 66 and i-1= 22
            }i++;                               // ex = 22,66...... (not sorted)
        } 
        return true;
    }


   public static int[] input_array(){
    Scanner input = new Scanner(System.in);
    System.out.println("welcome to sorted array checker");
    System.out.print("Enter the no of elements you want to store in the array:");
    int size = input.nextInt();
    int[]arr = new int[size];
    int i = 0;
    while (i<size) {
        System.out.println("enter the element no "+ (i+1)+":");
        arr[i]=input.nextInt();
        i++;
    }
    return arr;
   }
}
