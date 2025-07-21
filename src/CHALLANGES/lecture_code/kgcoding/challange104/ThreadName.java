package CHALLANGES.lecture_code.kgcoding.challange104;

public class ThreadName implements Runnable {

 //   public ThreadName(char threadnum) {
   //     this.threadnum = threadnum;
    //}

  //  private char threadnum;
    @Override
    public void run() {
        System.out.printf("\nSTARTED Thread:%s ",Thread.currentThread().getName());

        try {
            Thread.sleep(getrandom()*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("\nEnded thread:%s ",Thread.currentThread().getName());

    }
     private int getrandom(){
        double random = Math.random()*5+1;
        return (int)random;

     }
     }

