import java.util.Scanner;

public class mergingsortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to merging two sorted array");
        int[] arr1 = input_array();
        System.out.println();
        System.err.println(" Enter second arr");
        int[] arr2 =input_array();
        int[] merged = merging_sorted(arr1, arr2);
        System.out.println("Here is your merged array:  ");
        display_arr(merged);
    }
        public static int[] merging_sorted(int[]arr1,int[]arr2){
            int newsize = arr1.length+arr2.length;
            int[] newarr = new int[newsize]; 

            int i = 0,j=0,k=0;
            while (i<arr1.length || j<arr2.length) {
                
            if (j==arr2.length||i<arr1.length && arr1[i]<arr2[j]) {
                newarr[k]=arr1[i];
                i++;
                k++;
            }else{
                newarr[k]=arr2[j];
                k++;
                j++;
            }
        }
            return newarr; 
        }

    public static int[] input_array() {
        Scanner input = new Scanner(System.in);
    System.out.print("Enter the size of the array: ");
    int size = input.nextInt();
    int[] arr = new int[size];
    int i = 0;
    while (i<size) {
    System.out.print("Enter the element no"+(i+1)+ ":");
        arr[i]=input.nextInt();
        i++;
    }
    return arr;
    }
    public static void display_arr(int[]mergedarr){
        int i = 0;
        while (i<mergedarr.length) {
            System.out.print(mergedarr[i]+" ");
            i++;
        }
    }
}
