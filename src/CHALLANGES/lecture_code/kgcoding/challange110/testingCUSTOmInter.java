package CHALLANGES.lecture_code.kgcoding.challange110;

public class testingCUSTOmInter {
    public static void main(String[] args) {

        canditade Can = num -> {
            for (int i = 2; i < num ; i++) {
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(Can.iscandidate(5));
        System.out.println(Can.iscandidate(12));

    }
}
