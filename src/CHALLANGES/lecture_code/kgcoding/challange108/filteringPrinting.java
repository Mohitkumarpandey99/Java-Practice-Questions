package CHALLANGES.lecture_code.kgcoding.challange108;

import java.util.List;

public class filteringPrinting {
    public static void main(String[] args) {
        List<String>names = List.of("mohit","kumar pandey","is","the","best coder in","the world","and he owns a range rover velar (black)");
        String result = names.stream()
                .filter(name->name.length()<40     )
                .reduce("",(a,b)->a+" "+b);
               System.out.println(result);
    }
}