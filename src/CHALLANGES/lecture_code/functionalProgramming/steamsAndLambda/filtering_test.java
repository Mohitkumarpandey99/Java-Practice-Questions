package CHALLANGES.lecture_code.functionalProgramming.steamsAndLambda;

import java.util.List;
import java.util.function.Consumer;

  public class filtering_test {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","mango","cherry","date");
        System.out.println(fruits.size());
        System.out.println("printing normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("printing by steams");
        fruits.stream().forEach(new Consumer<String>() { //consumer is a functional interface
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("printing by filter useing");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit-> System.out.println(fruit)); //terminal who calls the opertions(lazy)
    }
}
