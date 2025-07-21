
package CHALLANGES.lecture_code.kgcoding.challange77.utils;

import in.kgcoding.challange77.geometry.circle;
import in.kgcoding.challange77.geometry.rectangle;

public class  calculator {
    public static void main(String[] args) {
        circle Cir = new circle(5.5);
        rectangle rect = new rectangle(10,5);

        double cir_area = Math.PI * Math.pow(Cir.radius,2);
        double rect_area = rect.length *rect.width;

        System.out.printf("area of the circle is: %.2f and area of the rectangle is: %.2f",cir_area,rect_area);

    }
}
