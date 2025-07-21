package CHALLANGES.lecture_code.kgcoding.challange92.challange93;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


  class reverseList {
    public static void main(String[] args) {
        List<Integer>list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void reverseLIST(List<Integer>list){
        for (int i = 0; i<list.size()/2; i++) {
            swappingutils.swap(list,i,list.size()-1-i);
        }
      }
}
