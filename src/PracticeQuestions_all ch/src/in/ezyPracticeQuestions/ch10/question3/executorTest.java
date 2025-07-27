package PracticeQuestions_all;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executorTest {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5 ; i++) {
            MyTask task = new MyTask("Task-"+i);
            executor.submit(task);
        }
        executor.shutdown();
    }
}
