package PracticeQuestions_all;

public class Threading extends Thread {
     private String threadName;

    public Threading(String threadName) {
        this.threadName = threadName;
        }

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println(threadName+"="+i);

            try {
                sleep(500);
        } catch (InterruptedException e) {
                System.out.printf("%s exception occured: %s ",threadName,e.getMessage());;
            }
        }
}
}
