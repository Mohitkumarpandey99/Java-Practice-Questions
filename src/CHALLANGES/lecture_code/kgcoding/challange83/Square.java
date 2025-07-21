package CHALLANGES.lecture_code.kgcoding.challange83;

public class Square extends Shape{
    private final double sideInCms;     // Final cause just using getter not using setter to change the value while testing


    public Square(double sides) {
        this.sideInCms = sides;
    }

    public double getSides() { // (getter) if someone wants to access the value of sideInCms
        return sideInCms;
}

    @Override
    public double calculateArea() {
        return Math.pow(sideInCms,2);
    }
}
