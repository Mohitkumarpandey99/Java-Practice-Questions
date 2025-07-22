package PracticeQuestions_all;

import java.util.Scanner;

public class largestElement {
    public static void main(String[] args) {
        System.out.println("welcome to largest element finder");
        System.out.print("enter the size of your array: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int arr[] = arr(size);
        int ans = largest(arr);
        System.out.print("the largest number in your array is: "+ans);
    }

    public static int largest(int arr[]) {
        int max = arr[0];//cause if all no in the array is negative 0 will give wrong result so we added first index
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static int[] arr(int size){
      Scanner input = new Scanner(System.in);
        int[] arr = new int[size];
        for (int i = 0; i < size ; i++) {
            System.out.print("enter the "+(i+1)+"st "+"element: ");
            arr[i] = input.nextInt();
        }
        return arr;
    }
}

