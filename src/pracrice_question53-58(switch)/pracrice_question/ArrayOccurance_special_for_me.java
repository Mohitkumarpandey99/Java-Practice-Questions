import java.util.Scanner;

public class ArrayOccurance_special_for_me {

    //this code is the proof that if you will work hard in hard times without 
    //giving up you will definetily succeed just work hard nothing else to do.
    //krishna will handel everything.

    public static void main(String[] args) {

        int[]numarray = input_arr();
        Scanner input = new Scanner(System.in);
        System.out.print("enter the number whose occurance to check:");
        int num = input.nextInt();
       int occured = occurance(numarray, num);
       System.out.println();
       System.out.println("the no of occurance of "+ num +" is: "+occured+" times");
        
    }
    public static int occurance(int[]numarray,int num){
        int counter=0;
        int i = 0;
        while (i<numarray.length) {
            if (numarray[i]==num) {
                counter++;
            }
            i++;
        }
        return counter;
    }


    public static int[] input_arr(){
        Scanner input = new Scanner(System.in);
        System.out.println("**welcome to array occurance checker**");
        System.out.println("-----------------------------------------");
        System.out.print("enter the no of elements you want:");
        int size = input.nextInt();
        int [] arr = new int[size];
        int i = 0;
        while (i<size) {
            System.out.println();
              System.out.print("enter the element No "+ (i+1)+":");
               arr[i]=input.nextInt();
              i++;
        }
      return arr;
    }
}