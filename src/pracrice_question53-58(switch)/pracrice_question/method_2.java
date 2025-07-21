public class method_2 {
    public static void main(String[] args) {
     print_pattern();

    }
    public static void print_pattern(){
        int row = 0;
        while(row<5){
            System.out.print("*");
            int i = 0;
            while (i<row) {
                System.out.print(" *");
                i++;
            }
              System.out.println(); 
             row++;
           
        }
    }
}
