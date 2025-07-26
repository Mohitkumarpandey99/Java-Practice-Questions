package PracticeQuestions_all;

public class genericTest {
    public static void main(String[] args) {
      Integer[] arr1 = {4,5,6,7,8};
      Double [] arr2 = {4.4,5.3,5.5};
      String [] arr3 = {"mohit","pandey","rahul","tiwary"};

      printArray(arr1);
      printArray(arr2);
      printArray(arr3);
    }
    public static <T> void printArray(T[] arr){
        for (T element : arr) {
            System.out.print(element+" ");
            System.out.println();
        }
    }
}
