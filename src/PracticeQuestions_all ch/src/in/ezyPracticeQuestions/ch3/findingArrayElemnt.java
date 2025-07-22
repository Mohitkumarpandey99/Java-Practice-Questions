package PracticeQuestions_all;

import java.util.Scanner;

public class findingArrayElemnt {
    public static void main(String[] args) {
        System.out.println("welcome to element finder in an array");
        int[]arr = {1,33,44,2,45,22};
        System.out.print("enter the element to search: ");
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        boolean ans = finder(arr,element);
        if (ans){
            System.out.println("your number is present in the array!!");
        }else {
            System.out.println("your element does not exists in the array!!");
        }
    }
    public static boolean finder(int[]arr,int element){
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==element){
                return true;
            }
            }
        return false;
        }
    }

