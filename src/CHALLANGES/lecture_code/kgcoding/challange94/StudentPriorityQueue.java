package CHALLANGES.lecture_code.kgcoding.challange94;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getGrade() - t1.getGrade();
            }
        });

        queue.offer(new Student("prashant", 'B'));
        queue.offer(new Student("ravi", 'C'));
        queue.offer(new Student("ankur", 'A'));
        queue.offer(new Student("ram", 'A'));
        queue.offer(new Student("ram", 'D'));

        System.out.printf("queue is : %s\n", queue);
        System.out.printf("queue is : %s\n",queue.poll());
        System.out.printf("queue is : %s\n",queue.poll());
        System.out.printf("queue is : %s\n",queue.poll());
        System.out.printf("queue is : %s\n",queue.poll());
        System.out.printf("queue is : %s\n",queue.poll());

    }


    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;

        }
    }
}

