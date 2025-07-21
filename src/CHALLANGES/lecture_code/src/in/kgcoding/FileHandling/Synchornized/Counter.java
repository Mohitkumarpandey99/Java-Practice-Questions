package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling.Synchornized;

public class Counter {

    private int counter = 0;

    public synchronized void increment(){
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
