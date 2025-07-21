import java.util.Scanner;

public class Arrayoccurance_2darray {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        System.out.println("welcome to 2d search");
        int[][] numarr = input2d_arr();
        System.out.print("enter the element to search:");
        int element = input.nextInt();
        boolean isfound = searching(numarr, element);
        if (isfound) {
            System.out.println("your element ias found in the array");
        
        }else{
            System.out.println("your element is  not  found in the array");
        }

    }
    public static boolean searching(int[][]numarr,int element){
        int i = 0 ;
        while (i<numarr.length) {
            int j = 0; 
            while (j<numarr[i].length) {
                if (numarr[i][j] == element) {
                    return true;   
                }
                 j++;
            }
            i++;
        }
        return false;

    }

      public static int[][] input2d_arr(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of rows");
        int rows =input.nextInt();

         System.out.println("enter the number of col");
        int col =input.nextInt();
        int[][]numarr = new int[rows][col];
        
        int i = 0;
        while (i<rows){
            int j = 0;
            while (j<col) {
                System.out.println("enter the element row: "+(i+1)+"column:"+(j+1) + " :");
                numarr[i][j] = input.nextInt();
                j++;
            } 
            i++;
        }
        return numarr;
      }
}
