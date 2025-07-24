package PracticeQuestions_all;

public class Student extends Person{

    private double height;
    private int age;

    public Student(String name, String gender, int weight,double height,int age) {
        super(name, gender, weight);
        this.height = height;
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displaydetails(){
        super.display();
        System.out.println("height:"+height);
        System.out.println("age:"+age);
    }
}
