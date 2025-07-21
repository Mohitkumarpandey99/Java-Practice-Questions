package CHALLANGES.lecture_code.kgcoding.Challange103;

public class printNumbers implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.printf("%d , ",i);
        }
    }
}
