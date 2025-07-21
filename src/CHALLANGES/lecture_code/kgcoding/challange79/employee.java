package CHALLANGES.lecture_code.kgcoding.challange79;

public class employee {
    private String name;
    private String age;
    private double salary;

     employee(String name, String age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
     String getEmployeeDetails(){
         return "Employee Details: Name:"+name
                 +",Age:"+age
                 +",Salary:"+salary;
     }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
