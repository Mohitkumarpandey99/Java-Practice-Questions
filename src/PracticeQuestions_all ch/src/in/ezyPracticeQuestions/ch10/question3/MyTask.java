package PracticeQuestions_all;

public class MyTask implements Runnable {
    private final String taskname;

    public MyTask(String taskname) {
        this.taskname = taskname;
    }

    @Override
    public void run() {
        System.out.println(taskname+"is running on"+Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(taskname+"error occured"+e.getMessage());
        }
        System.out.println(taskname+"completed");

    }
}
