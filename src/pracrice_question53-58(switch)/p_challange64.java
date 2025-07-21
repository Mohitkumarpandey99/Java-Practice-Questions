import java.util.Scanner;

public class p_challange64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to occurance checker");
        System.out.println("enter the size of the array you want");
        int size = input.nextInt();
        int[]arr = new int[size];
        int i = 0;
        while (i<size) {
            System.out.println("enter the element number "+(i+1)+":");
            arr[i]=input.nextInt();
            i++;
        }
        System.out.println("enter the number to check the occurance:");
        int num = input.nextInt();

        int occurances = isfound(arr,num);
       System.out.println("your number is preasent in the array "+occurances+"times");
        
    }
    public static int isfound(int[]arr,int num){

        int counter = 0;
        for (int i : arr) {
            if (i == num) {
                counter++;
            
            }
            
        }
        return counter;
        
    }
}
