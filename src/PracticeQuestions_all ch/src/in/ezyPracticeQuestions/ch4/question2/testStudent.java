package PracticeQuestions_all;

public class testStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("mohit",100,28);
        Student stu2 = new Student("rohit",33,22);

        System.out.println(stu1);
        stu1.result();
        System.out.println(stu2);
        stu2.result();

    }
}
