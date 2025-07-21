 class p_challange70 {
    String name;
    int age;
    String rollnum;
    String house;

    public p_challange70(String name, int age, String rollnum, String house) {
        this.name = name;
        this.age = age;
        this.rollnum = rollnum;
        this.house = house;
    }

    public String toString(){
        return "Student details:{name:" + name +
               ", age:" + age +", rollno:" + rollnum +
               ", house:" + house + "}";
    }
    public static void main(String[] args) {
        p_challange70 student = new p_challange70("mohit", 20, "28", "conquror");
        System.out.println(student);
    }
}
