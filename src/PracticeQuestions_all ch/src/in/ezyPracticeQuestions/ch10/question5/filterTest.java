package PracticeQuestions_all;

import java.util.Arrays;

public class filterTest {
    public static void main(String[] args) {
        String[] names  = {"Mohit","prince","david","luci","cristeana","abhi"};

        Arrays.stream(names).
                filter(name -> name.length()>4).
                filter(name ->!name.startsWith("a")).
                forEach(name-> System.out.println(name));
    }
}
