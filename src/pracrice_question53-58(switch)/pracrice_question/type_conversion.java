public class type_conversion {
    public static void main(String[] args) {
        int eint = (int)3.4; //data loss possible
        long ebig = (long)3.4;
        float edec = (float)3.44654675785876868687567564654; 
         // by default 3.4 is considerd as double
        System.out.println(eint + "\n" + ebig + "\n" + edec);
    }
}
