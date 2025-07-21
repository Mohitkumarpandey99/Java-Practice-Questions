package CHALLANGES.lecture_code.kgcoding.challange90;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class coustomCompartor   {
     public static void main(String[] args) {
         List<String> stringList = Arrays.asList("ant","lion","bear","monkey","zebra");
         System.out.println(stringList);
         sortINdesending(stringList);
         System.out.println(stringList);
     }
     public static void sortINdesending(List<String>stringList){
         Collections.sort(stringList, new Comparator<String>() {
         public int compare(String s,String t1){
             if(s.equals(t1)){
                 return 0;
             }else if(s.charAt(0)<t1.charAt(0)){
                 return 1;
             }
             else {
                 return -1;
             }

         }
         });
     }
}
