import java.util.Scanner;

public class Deletingelement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int[] numarray = input_arr();
         System.out.println("enter the element to delete");
        int element = input.nextInt();
        int[] newarray= deleting(numarray, element);
        System.out.println("here is a n ew array :");
        display_arr(newarray);
    }
    public static int[] deleting(int[]numarray,int element){
        int occ = ArrayOccurance_special_for_me.occurance(numarray, element);
        if (occ == 0) {
            return numarray;
        }
        int newsize = numarray.length - occ;
        int [] newarr = new int[newsize];

        int i = 0,j = 0;
        while (i<numarray.length) {
            if (numarray[i]!=element) {
                newarr[j]=numarray[i];
                j++;
            }
            i++;
        }
        return newarr;
      

    }
    public static int[] input_arr(){
        System.out.println("Welcome to deleting element from an array");
        System.out.println("enter the arry size");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[]numarray=new int[size];
        int i = 0;
        while (i<size) {
            System.out.println("enter the element no "+ (i+1) +":");
            numarray[i]=input.nextInt();
            i++;
    }
    return numarray;
}

    public static void display_arr(int[]numarray){
    int i = 0;
    while (i<numarray.length) {
        System.out.println(numarray[i]+" ");
        i++;
    }
    System.out.println();
}
}