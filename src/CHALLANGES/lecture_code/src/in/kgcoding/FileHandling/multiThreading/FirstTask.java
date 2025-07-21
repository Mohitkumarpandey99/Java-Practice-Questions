package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling.multiThreading;

public class FirstTask extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            System.out.printf("%d*",i);

        }
        System.out.println("\n First task done");
    }
}

