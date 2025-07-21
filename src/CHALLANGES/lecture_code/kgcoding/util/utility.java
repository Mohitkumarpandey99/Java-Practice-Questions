package CHALLANGES.lecture_code.kgcoding.util;

import java.util.Collection;

public class utility {
    public static <E> void print(Collection<E>collection){
        System.out.print("collection is: ");
        for (E coll : collection) {
            //System.out.printf("%s",coll);
        }
        System.out.println(collection);
        System.out.println();
    }
}
