package CHALLANGES.lecture_code.kgcoding.challange113;

import java.util.List;

public class distinctTest {
    public static void main(String[] args) {
        List<Integer>num=List.of(1,1,2,2,3,3,4,4,5,5);
        List<Integer>noDubli = num.stream()
                                   .distinct()
                                    .toList();
        System.out.println(num);
        System.out.println(noDubli);
    }
}
