package PracticeQuestions_all;

public class TestCustomClass {
    public static void main(String[] args) {
      try {
          checkAge(15);
      } catch (MyCustomException e) {
          System.out.println("caught a custom exception "+e.getMessage());
      }

    }
  public static void checkAge (int age) throws MyCustomException {
        if (age<18){
            throw new MyCustomException("age must be above 18 Access denined");
        }else {
            System.out.println("access granted");
        }
  }
}
