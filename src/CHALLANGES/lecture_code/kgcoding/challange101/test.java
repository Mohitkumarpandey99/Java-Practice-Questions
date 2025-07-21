package CHALLANGES.lecture_code.kgcoding.challange101;

public class test {
    public static void main(String[] args) throws InterruptedException {
        threding t1 = new threding(1);
        threding t2 = new threding(2);
        threding t3 = new threding(3);

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        


    }


}
