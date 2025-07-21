package CHALLANGES.lecture_code.kgcoding.challange87;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to divide calculator!!");
        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number!!!");
        int second = input.nextInt();
        try {
            int result = first / second;
            System.out.printf("Result is %d:",result);
        }catch (ArithmeticException exception){
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("error dividing by Zero");
            }else{
                throw exception;

                }
            }
        }
        // divide(first,second);
    }

   // public static int divide(int first, int second){
     //   int result = 0;
      //     try {
              //  result = first / second;
             //  System.out.println("ans is:"+result);
              // return result;
          // }catch (ArithmeticException exception){
//System.out.println("error divide by zero!!,enter valid value!!");

        //   }

  //  return result;}



