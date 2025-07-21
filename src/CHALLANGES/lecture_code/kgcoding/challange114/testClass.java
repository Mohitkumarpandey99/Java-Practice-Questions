package CHALLANGES.lecture_code.kgcoding.challange114;

import java.util.List;

public class testClass {
    public static void main(String[] args) {
        List<CustomClass> list = List.of(
                new CustomClass("mohit", 1000000),
                new CustomClass("prashant", 100),
                new CustomClass("raga", 767860),
                new CustomClass("jasmeet", 87),
                new CustomClass("rahul", 1687)
        );
        list.stream()
                //or
               // .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(),emp2.getSalary()))
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}