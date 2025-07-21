package CHALLANGES.lecture_code.kgcoding.CHALLANGE82;

public class TestArr {
    public static void main(String[] args) {
        ArrayOperations opr = new ArrayOperations(new int[]{1,6,5,9});
        ArrayOperations.Statistics statistics1 = opr.new Statistics();
        System.out.println(statistics1.mean());
        System.out.println(statistics1.median());

        ArrayOperations opr2 = new ArrayOperations(new int[]{1,3,5,9,5});
        ArrayOperations.Statistics statistics2 = opr.new Statistics();
        System.out.println(statistics2.mean());
        System.out.println(statistics2.median());

    }

}
