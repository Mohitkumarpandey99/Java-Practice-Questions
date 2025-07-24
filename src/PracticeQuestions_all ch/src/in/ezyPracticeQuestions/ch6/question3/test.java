package PracticeQuestions_all;

public class test {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent ref = new Child(); //polymorphism
        parent.printME();//parent
        child.printME();//also calls childs method
        ref.printME();//polymorphism print me behaving diffrently with child

    }
}
