import java.util.Scanner;

public class parametersVsarguments1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int no1 = input.nextInt();

        System.out.println("enter second number");
        int no2 = input.nextInt();

      int result = addtwoNo(no1,no2);
      System.out.println(result);  
      System.out.println(addtwoNo(6, 5));

    }

public static int addtwoNo(int first,int second){
int sum = first+second;
return sum;
//also can do direct.  return first+second;
}
}
