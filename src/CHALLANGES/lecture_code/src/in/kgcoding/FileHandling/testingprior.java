package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling;

public class testingprior {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        in.kgcoding.FileHandling.multiThreading.FirstTask t1 = new in.kgcoding.FileHandling.multiThreading.FirstTask();
        in.kgcoding.FileHandling.multiThreading.SecondTask t2 = new in.kgcoding.FileHandling.multiThreading.SecondTask();
        in.kgcoding.FileHandling.multiThreading.ThirdTask t3 = new in.kgcoding.FileHandling.multiThreading.ThirdTask();

        t1.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.start();
        t3.setPriority(Thread.NORM_PRIORITY);
        System.out.println("\n");
        t3.getPriority();
        long endtime = System.currentTimeMillis();
        System.out.printf("Current thread = %s time taken:%d,",Thread.currentThread().getName(),StartTime-endtime);
    }
}
