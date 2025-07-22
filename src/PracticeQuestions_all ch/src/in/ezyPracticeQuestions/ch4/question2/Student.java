package PracticeQuestions_all;

public class Student {
    private String name;
    private int marks;
    private int rollno;

    public void result(){
        if (marks>40){
            System.out.println("you are passed!!");
        }else {
            System.out.println("you are failed!!");
        }

    }

    public Student(String name, int marks, int rollno) {
        this.name = name;
        this.marks = marks;
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", rollno=" + rollno +
                '}';
    }
}
