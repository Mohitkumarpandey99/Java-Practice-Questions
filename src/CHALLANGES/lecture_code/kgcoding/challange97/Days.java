package CHALLANGES.lecture_code.kgcoding.challange97;

public class Days {
    public static void main(String[] args) {
        System.out.println("days with their type");
        for (Day day : Day.values()) {
            System.out.printf("%s is a : %s\n",day,day.gettype());
        }
    }
}
