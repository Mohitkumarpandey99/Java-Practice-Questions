package CHALLANGES.lecture_code.kgcoding.challange79;

public class TestEmployee {
    public static void main(String[] args) {
        employee emp = new employee("rahul","34",3500.00);
        System.out.println(emp.getEmployeeDetails());

        emp.setName("golu");
        System.out.println(emp.getEmployeeDetails());

    }

}
