package CHALLANGES.lecture_code.kgcoding.CHALLANGE82;

public class ArrayOperations {

    private int[] arr;

    public ArrayOperations(int[] arr) {
        this.arr = arr;
    }

    public class Statistics{

        double mean(){
            double sum = 0;
            for (int num : arr) {
                sum += num;
            }
                return sum/arr.length;
        }

        double median(){
        int[] sorted = arr.clone(); // coping the array values in sorted
        java.util.Arrays.sort(sorted); // sorting the array
            int n = sorted.length; // checking the length of the array
             if (n % 2 == 1){ //if odd
                 return sorted[n / 2]; //return middle value of the array
             }
             else {
                 // if Even: add 2 middle numbers and then divide it by 2 to get the avg of them.
                 // the avg of those 2 numbers will be the median of that even length arr.
                 return ( sorted[n / 2 - 1]+sorted[n / 2]) / 2.0;
             }
        }
    }

}
