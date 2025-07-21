package CHALLANGES.lecture_code.kgcoding.challange98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class MapExercise {
     public static void main(String[] args) {
         Map<String,String>map = new HashMap<>();
         map.put("Bharat","NewDelhi");
         map.put("China","Bejing");
         map.put("pakistan","Islamabad");
         map.put("Srilanka","Columbo");
         map.put("Bangladesh","dhaka");
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("\nenter the country!!(standard form)");
            String country = input.next();
            if (map.containsKey(country)) {
                System.out.printf("Capital of %s is %s", country, map.get(country));
            } else {
                System.out.println("no data available for this country!!");
            }
        }
     }


}
