package PracticeQuestions_all;

import java.util.Arrays;
import java.util.HashSet;

public class dublicatesRemoval {
    public static void main(String[] args) {
       int[] arr = {1,1,2,2,3,3,4,4,5,5,6,6,7,5,7,5,66 };
       HashSet<Integer> set = new HashSet<>();

       for (int num: arr){
       set.add(num);
       }

       Integer []  uniqueArray = set.toArray(new Integer[0]);
        System.out.println("the unique array is:"+Arrays.toString(uniqueArray));

    }
}
