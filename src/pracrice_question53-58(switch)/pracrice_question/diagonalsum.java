import java.util.Scanner;

public class diagonalsum {
    public static void main(String[] args) {
        System.out.println("Welcome to diagonal sum calculator in an array");
         int[][]numarr=input_2darr();
         long sum = sum(numarr);
         System.out.println("here is the sum of diagonals of your array : "+sum);

    }
    public static long sum(int[][]arr){
     long leftsum = sumofleft(arr);
     long rightsum = sumofRight(arr);
     long sum = leftsum + rightsum;
     if (arr.length % 2 !=0) {
        int ind = arr.length/2;
        sum -= arr[ind][ind];
     }
        return sum;
    }
    public static long sumofleft(int[][]arr){
     int sum = 0;
     int i = 0;
     while (i<arr.length) {
        sum+=arr[i][i];
        i++;
     }
        
        return sum;
    }
    public static long sumofRight(int[][]arr){
        int sum = 0;
        int i = 0;
        while (i<arr.length) {
            int col = arr.length-1-i;
            sum+= arr[i][col];
            i++;
        }
        return sum;
    }

    public static int[][] input_2darr(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter row size");
        int row = input.nextInt();
        System.out.println("enter column");
        int col = input.nextInt();

        int[][]numarr = new int[row][col];
        int i = 0;
        while (i<row) {
            int j = 0;
            while (j<col) {
                System.out.println("enter the element row: "+(i+1)+"column:"+(j+1)+":");
                numarr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numarr;
    }
}
