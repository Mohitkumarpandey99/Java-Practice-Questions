package PracticeQuestions_all;

public class myRunnable implements Runnable {
     private String threadName;

    public myRunnable(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        for (int i = 0; i <=5 ; i++) {
            System.out.println(threadName+"="+i);
            try {
             Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName+"exception occured:"+e.getMessage());
            }
        }
    }
}
