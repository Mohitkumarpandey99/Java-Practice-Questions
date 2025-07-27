package PracticeQuestions_all;

public class testingMultiThreading {
    public static void main(String[] args) {
        Threading t1 = new Threading("thread1");
        Threading t2 = new Threading("thread2");

        t1.start();
        t2.start();
    }
}
