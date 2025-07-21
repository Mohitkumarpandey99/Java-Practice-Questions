import java.util.Scanner;

public class searcingArray {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int[] myarr = {5,6,34,32,65,56,90,89,69,11};
    System.out.println("welcome to array searching");
    System.out.println("enter the number to search in the array:    ");
    int num = input.nextInt();
    boolean isfound = isfound(myarr, num);
    if (isfound) {
        System.out.println("your no is found in the array");
    }else {
        System.out.println("not found");
    }
    }
    public static boolean isfound(int[] arr,int num){
        int index = 0;
        while (index<arr.length) {
            if (arr[index]==num) {
                return true;
               
            }
             index++;
            
        }
        return false;
    }
}
