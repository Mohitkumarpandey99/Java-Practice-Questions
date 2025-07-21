package CHALLANGES.lecture_code.executor;

import oopsex.src.in.kgcoding.challange99.PrintingThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class singleThreadtesting {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintingThread task1 = new PrintingThread(1);

        service.submit(task1);

        service.shutdown();

    }
}
