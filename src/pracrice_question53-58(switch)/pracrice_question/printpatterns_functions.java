import java.util.Scanner;

public class printpatterns_functions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to pattern printer");
        System.out.println("enter no of rows:");
        int rows = input.nextInt();
        printpatterns(rows);
        reversepattern(rows);
        spacepattern(rows);
    }
    public static void printpatterns(int rows){
        System.out.println("rigt half pyramid");
        int i= 0;
        while (i<rows) {
            System.out.print("* ");
            int j = 0;
            while (j<i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void reversepattern(int maxrows){
        System.out.println("reverse right half pyramid");
       int rows = maxrows;
       while (rows > 0) {
         int i = 0;
         while (i<rows) {
            System.out.print("* ");
            i++; 
         }


        System.out.println();
       rows--;
       }
       
    }
    public static void spacepattern(int maxrows){
        System.out.println("left half pyramid");
        int rows = maxrows;
        while (rows>0) {
        int j = 0;
        while (j<rows-1) {
            System.out.print("  ");
            j++;
        }
            //prints stars
            int i = 0;
            while (i<=maxrows-rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }
}
