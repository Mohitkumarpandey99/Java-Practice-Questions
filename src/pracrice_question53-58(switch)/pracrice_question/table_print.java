import java.util.Scanner;

public class table_print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to tabel printer");
        System.out.print("enter the tabel yopu want to print: ");
        int num = input.nextInt();
        print_table(num);    
        }

    
 public static void print_table(int a){
 int i = 1;
        while (i <= 10) {
            int product = a * i;
            System.out.println(a +"X"+ i +"="+ product);
            i++;
}
}
}
