package PracticeQuestions_all;

public class Circle extends Shape{

    @Override
    public double area(double radius){
       double area = Math.PI*(Math.pow(radius,2));
        return area;
    }
}
