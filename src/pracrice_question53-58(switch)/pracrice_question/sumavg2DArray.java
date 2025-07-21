import java.util.Scanner;

public class sumavg2DArray {
    public static void main(String[] args) {
        System.out.println("welcome to sum avg 2d array");
        int[][]numarray = input2d();
        long sum = sum(numarray);
        double avg = avg(numarray);
        System.out.println("The sum of your array is:"+" "+sum);
           System.out.println("The avg of your array is:"+" "+avg);

    }

public static double  avg(int[][]numarray){
    if (numarray.length==0) {
        return 0;
    }
    int rows = numarray.length;
    int col = numarray[0].length;
    double totalsize = rows * col;
    return sum(numarray) / totalsize;
    }
    
    public static long sum(int[][]numarray){
        int sum = 0;
        int i=0;
        while (i<numarray.length) {
            int j = 0;
            while (j<numarray[i].length) {
                sum+=numarray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
    public static int[][] input2d(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the row:");
        int row = input.nextInt();
        System.out.println("enter the size of the column");
        int col = input.nextInt();

        int[][] numarr = new int[row][col];
        int i = 0;
        while (i<row) {
            int j = 0;
            while (j<col) {
                System.out.println("Enter the element row "+(i+1)+"column "+(j+1)+" :");
                numarr[i][j]=input.nextInt();
                j++;
            }
            i++;
        }
        return numarr;
    }
}
