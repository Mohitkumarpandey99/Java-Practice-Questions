package CHALLANGES.lecture_code.kgcoding.Challange100;

public class testingStTES {
    public static void main(String[] args) throws InterruptedException {
        StatePrinting t1 = new StatePrinting();
        System.out.printf("\n%s Thread created",t1.getState());
        t1.start();
        t1.join();//runs the ending state after the execution of the run method
        System.out.printf("\n%s thread ending",t1.getState());
    }
}
