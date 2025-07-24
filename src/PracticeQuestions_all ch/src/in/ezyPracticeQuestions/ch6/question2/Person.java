package PracticeQuestions_all;

public class Person {
     private String name;
     private String gender;
     private int weight;

    public Person(String name, String gender, int weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }


    public void walks(){
         System.out.println("person is walking!!");
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

   public void display(){
       System.out.println("name:"+name);
       System.out.println("gender:"+gender);
       System.out.println("weight:"+weight);
   }
}
