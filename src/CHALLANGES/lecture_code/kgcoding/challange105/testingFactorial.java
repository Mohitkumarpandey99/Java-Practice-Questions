package CHALLANGES.lecture_code.kgcoding.challange105;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class testingFactorial {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newFixedThreadPool(3)) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                factorial task = new factorial(i);

                list.add(service.submit(task));
            }
            for (Future<Integer> future : list) {
                System.out.printf("\n Result is %d", future.get());
            }
            service.shutdown();

            if (!service.awaitTermination(15, TimeUnit.SECONDS)){
                System.out.println("EMERGENCY SHUTDOWN");
                service.shutdownNow();
            }


        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);


        }

    }
}
