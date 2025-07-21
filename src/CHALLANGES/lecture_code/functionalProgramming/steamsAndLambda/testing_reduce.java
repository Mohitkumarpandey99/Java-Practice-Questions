package CHALLANGES.lecture_code.functionalProgramming.steamsAndLambda;

import java.util.List;
import java.util.function.BinaryOperator;

public class testing_reduce {
    public static void main(String[] args) {
        List<Integer>list = List.of(1,2,3,4,5,6);

        int sum = 0;
        for (Integer i : list) {
            sum += i;
        }
        System.out.printf("\nnormally printing: %d",sum);

      int result =  list.stream()
                  .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer + integer2;
                    }
                });
        System.out.printf("\n%d result using reduce",result);

        int numsum2 = list.stream().reduce(0,(a,b)-> a+b);
        System.out.printf("\nsum using lambda: %d ",numsum2);

        int max = list.stream()
                .reduce(Integer.MIN_VALUE,(a,b)->a>b ? a : b);
        System.out.printf("\nmax value is %d",max);

        int min = list.stream().reduce(Integer.MAX_VALUE,(a,b)->a<b?a:b);
        System.out.printf("\nminimum value is : %d",min);
    }
}
