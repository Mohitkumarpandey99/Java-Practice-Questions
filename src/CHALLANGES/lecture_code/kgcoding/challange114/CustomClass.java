package CHALLANGES.lecture_code.kgcoding.challange114;

public class   CustomClass {

    private String name;
    private int salary;

    public CustomClass(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "CustomClass{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
