package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling.Synchornized;

public class updaterThread extends Thread{

    private final Counter counter;

    public updaterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            counter.increment();
        }
    }
}
