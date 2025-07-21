package CHALLANGES.lecture_code.kgcoding.challange99;

public class testing {
    public static void main(String[] args) throws InterruptedException {
        PrintingThread t1 = new PrintingThread(1);
        PrintingThread t2 = new PrintingThread(2);


        t1.start();
       t1.join();//after t1 completes its execution then only t2 starts
        t2.start();
    }


 }
