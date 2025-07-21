package CHALLANGES.lecture_code.kgcoding.challange105;

import java.util.concurrent.Callable;

public class factorial implements Callable<Integer> {

    private final int number;

    public factorial(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
       // System.out.printf("\nThread %s",Thread.currentThread().getName());

        if (number <= 1){
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= number ; i++) {
        result *= i;
        }
        return result;
    }
}
