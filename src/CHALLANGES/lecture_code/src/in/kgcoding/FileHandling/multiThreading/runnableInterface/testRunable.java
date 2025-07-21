package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling.multiThreading.runnableInterface;

public class testRunable {
    public static void main(String[] args) {
        printTask printTask1 = new printTask('*');
        printTask printTask2 = new printTask('$');
        printTask printTask3 = new printTask('#');

        Thread T1 = new Thread(printTask1);
        T1.start();
        Thread t2 = new Thread(printTask2);
        t2.start();

       new Thread(printTask3).start();
    }
}
