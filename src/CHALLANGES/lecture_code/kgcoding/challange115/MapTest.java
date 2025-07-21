package CHALLANGES.lecture_code.kgcoding.challange115;

import java.util.List;

public class MapTest {
    public static void main(String[] args) {
        List<String>list = List.of("1","2","3","4","5");

        list.stream()
                .map(str->Integer.parseInt(str))
                .map(num -> Math.pow(num,2))
                .reduce((a,b)->a+b)
                .ifPresent(System.out::println);
    }
}
