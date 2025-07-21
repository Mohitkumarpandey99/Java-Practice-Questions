package CHALLANGES.lecture_code.kgcoding.Challange103;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class executor {
    public static void main(String[] args) {
        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            printNumbers numbers = new printNumbers();

            service.submit(numbers);

        }

    }



}
