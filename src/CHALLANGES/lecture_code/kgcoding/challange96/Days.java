package CHALLANGES.lecture_code.kgcoding.challange96;

public class Days {
    public static void main(String[] args) {
        System.out.println("printing all days  in the week!!");
        //System.out.println(Day.monday);
        //System.out.println(Day.tuesday);
        //System.out.println(Day.wednesday);
        //System.out.println(Day.thursday);
        //System.out.println(Day.friday);
        //System.out.println(Day.saturday);
        //System.out.println(Day.sunday);
        //real way
        for (Day day : Day.values()) {
            System.out.println(day);
        }
    }
}
