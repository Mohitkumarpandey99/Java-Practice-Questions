package CHALLANGES.lecture_code.kgcoding.challange83;

public class Testshape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);
        System.out.printf("the area of circle is: %.2f \n",circle.calculateArea());
        System.out.printf("the area of square is: %.2f \n", square.calculateArea());
        //System.out.println(circle.getRadiusInCms());
        // System.out.println(square.getSides());
    }
}
