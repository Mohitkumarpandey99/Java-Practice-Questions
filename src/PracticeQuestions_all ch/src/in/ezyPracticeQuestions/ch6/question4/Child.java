package PracticeQuestions_all;

public class Child extends Parent {
    public Child() {
        this("default name");//calls the constructor that tekse name and stores the name default name
        System.out.println("child with no arg");

    }
    public Child(String name){
        super(name); // calls parent constructors
        System.out.println("child constructr with name: "+name);
    }
}
