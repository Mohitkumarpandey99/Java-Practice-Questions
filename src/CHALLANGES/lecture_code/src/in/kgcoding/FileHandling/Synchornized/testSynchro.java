package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling.Synchornized;

public class testSynchro {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        updaterThread t1 = new updaterThread(counter);
        updaterThread t2 = new updaterThread(counter);


        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            System.out.println("thread intruppted "+ e.getMessage());;
        }
        long endtime = System.currentTimeMillis();
        System.out.printf("current time : %d\n",startTime-endtime);
        System.out.printf("Final value of the operation is : %d",counter.getCounter());
    }

}
