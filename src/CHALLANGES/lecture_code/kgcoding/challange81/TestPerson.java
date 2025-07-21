package CHALLANGES.lecture_code.kgcoding.challange81;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Mohit", 20);
        Person person2 = new Person("Mohit", 20);
        Person person3 = new Person("rahul", 33);

        System.out.println("p1 equals p2 :"+ person1.equals(person2));
        System.out.println("p1 equals p3 :"+ person1.equals(person3));

        //HASH CODES
        System.out.println("p1 hash code :"+ person1.hashCode());
        System.out.println("p2 hash code :"+ person2.hashCode());
        System.out.println("p3 hash code :"+ person3.hashCode());
    }
}
