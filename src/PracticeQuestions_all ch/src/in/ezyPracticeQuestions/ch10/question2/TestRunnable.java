package PracticeQuestions_all;

public class TestRunnable {
    public static void main(String[] args) {
        myRunnable r1 = new myRunnable("thread1");
        myRunnable r2 = new myRunnable("thread2");

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
