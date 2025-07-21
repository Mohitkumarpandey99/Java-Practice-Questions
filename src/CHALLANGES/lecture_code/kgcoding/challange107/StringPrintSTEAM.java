package CHALLANGES.lecture_code.kgcoding.challange107;

import java.util.List;

public class StringPrintSTEAM {
    public static void main(String[] args) {
        List<String>names = List.of("mohit kumar pandey","arohi","anshika");

        names.stream()
               // .filter(str ->str.length()>10)
                .forEach(name -> System.out.println(name));
      }
}
