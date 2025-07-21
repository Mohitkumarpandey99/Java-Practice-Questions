import java.util.Scanner;

class p_challange72 {
    double radiusInMm; //property

    p_challange72(double radiusInMm){ //constructor
       this.radiusInMm = radiusInMm;

    }
    double getcircumference(){ //method
        return 2*radiusInMm*Math.PI;
    }
    double getArea(){ //method
        return Math.PI * Math.pow(radiusInMm, 2);
    }
    @Override
    public String toString() {
        return "CIRCLE PROPS: Radius in Mm:" + radiusInMm +
         ",Circumference of circle in mm:" + getcircumference() +
         ",area of the circle in mm :" + getArea();
         
    }
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("welcome in the world of circle");
    System.out.println("enter the radius of the circle ");
    double radius = input.nextDouble();
    p_challange72 circle = new p_challange72(radius);//obj
    System.out.println(circle);
   }
}
