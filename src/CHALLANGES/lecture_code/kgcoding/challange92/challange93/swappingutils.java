package CHALLANGES.lecture_code.kgcoding.challange92.challange93;


import java.util.Arrays;
import java.util.List;

  public class swappingutils {
     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,3,6,7);
         swap(list,0,4);
         System.out.println(list);
    // }
    //public static void swap(List<Integer>list){//overloading
      //  list.set(2,1);
       // list.set(0,3);
        //list.set(3,7);
        //list.set(4,6);
        //utility.print(list);
    }


 public static void swap(List<Integer> list,int x,int y){
       int swap = list.get(x);
       list.set(x, list.get(y));
       list.set(y,swap);
 }
}