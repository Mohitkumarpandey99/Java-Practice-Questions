package CHALLANGES.lecture_code.kgcoding.challange99;

public class PrintingThread extends Thread {

    private final int threadNumber;

    public PrintingThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.printf("\n" +
                    " (%d) Hello from thread %d",i+1,threadNumber);
        }
    }
}
