package PracticeQuestions_all;

public class Cricle {
    private double radius;

    public double circumference(){
        double circumference = (Math.PI*2)*radius;
        return circumference;
    }

    public Cricle(double radius) {
        this.radius = radius;
    }
}
