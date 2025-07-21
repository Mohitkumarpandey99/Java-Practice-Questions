package CHALLANGES.lecture_code.kgcoding.Challange100;

public class StatePrinting extends Thread{
    @Override
    public void run() {
        try {
            sleep(4000);
            System.out.printf("\n" +
                    "%s from inside run ",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
