package PracticeQuestions_all;

public class Child extends Parent {
    @Override
    void display(String name){
        System.out.println("child method name : "+name);
        super.display("mohit");
    }

}
