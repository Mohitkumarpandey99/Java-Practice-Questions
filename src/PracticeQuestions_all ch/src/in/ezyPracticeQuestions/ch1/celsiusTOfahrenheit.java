package PracticeQuestions_all;

import java.util.Scanner;

public class celsiusTOfahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to celsius to fahrenheit converter ");
        System.out.print("enter the temperature in celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5)+32;
        System.out.println("The temperature in fahrenheit is :"+ fahrenheit);
    }
}
