package CHALLANGES.lecture_code.kgcoding.challange101;

public class threding extends Thread {
    private final int threadnum;

    public threding(int threadnum) {
        this.threadnum = threadnum;
    }

    @Override
    public void run() {
        System.out.printf("%s Thread Starting-%d\n",Thread.currentThread().getName(),threadnum);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Thread ENDED-%d\n",Thread.currentThread().getName(),threadnum);

    }

}
