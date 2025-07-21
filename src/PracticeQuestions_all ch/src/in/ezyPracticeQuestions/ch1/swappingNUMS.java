package PracticeQuestions_all;
//REVISION QUESTIONS
public class swappingNUMS {
    public static void main(String[] args) {
        int temp;
        int first = 22;
        int second = 44;

        System.out.printf("first is: %d and second is %d\n",first,second);

        temp = first;
        first = second;
        second = temp;

        System.out.printf("After swapping :  first is: %d and second is %d",first,second);
    }
}
