package CHALLANGES.lecture_code.kgcoding.challange80;

public class LibraryTest {
    public static void main(String[] args) {
        Book book = new Book("0051A");
        Dvd dvd = new Dvd(5);
        magzine Magzine = new magzine("5 APRIL 1999");

        book.isCheckout();
        book.isReturning();
        dvd.isCheckout();
        dvd.isCheckout();
        dvd.isReturning();
        Magzine.isCheckout();
        Magzine.isReturning();
        Magzine.isReturning();


    }
}
