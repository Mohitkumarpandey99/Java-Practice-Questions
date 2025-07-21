import java.util.Scanner;

public class p_challange57 {
    public static void main(String[] args) {
        int month;
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to momnth calender");
        System.out.println("enter your month in number (1-12)");
        month = input.nextInt();

        switch (month) {
            case 1:System.out.println("january");
                break;

             case 2:System.out.println("feb");
                break;

                 case 3:System.out.println("march");
                break;

                 case 4:System.out.println("april");
                break;

                 case 5:System.out.println("may");
                break;

                 case 6:System.out.println("june");
                break;

                 case 7:System.out.println("july");
                break;

                 case 8:System.out.println("aug");
                break;

                 case 9:System.out.println("sept");
                break;


                 case 10:System.out.println("oct");
                break;

                 case 11:System.out.println("november");
                break; 

                case 12:System.out.println("dec");
                break;
        
            default:System.out.println("invalid value enter (1-12)");
                break;
        }
    

    }
    
}


