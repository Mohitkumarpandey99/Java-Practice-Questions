package CHALLANGES.lecture_code.kgcoding.challange112;

import java.util.Optional;
public class optionalTEST {
    public static void main(String[] args) {
        System.out.println(tooptional(""));
        System.out.println(tooptional(null));
        System.out.println(tooptional("mohit "));
    }
    public static Optional<String>tooptional (String str){
        if (str==null||str.isEmpty()){
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
