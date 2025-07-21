package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling.multiThreading.runnableInterface;

public class printTask implements Runnable{

    @Override
    public void run() {
        System.out.println("\n");
        for (int i = 1; i <= 100 ; i++) {
            System.out.printf("%d%c",i,targetChar);
        }

        System.out.printf("%c %s task completed",targetChar,Thread.currentThread().getName());
    }

    private final char targetChar;

    public printTask(char targetChar) {
        this.targetChar = targetChar;
    }
}
