package PracticeQuestions_all;

public class sumofArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int ans = sumArr(arr);
        System.out.println("the sum of your array is : "+ans);
    }
    public static int sumArr(int arr[]){
        int sum = 0;
        for (int i = 0; i <=arr.length ; i++) {
            sum += i;
        }
        return sum;
    }
}
