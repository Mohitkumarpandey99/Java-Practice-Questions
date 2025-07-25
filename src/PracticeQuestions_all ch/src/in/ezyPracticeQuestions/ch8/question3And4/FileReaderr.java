package PracticeQuestions_all;

import java.io.FileReader;

public class FileReaderr {
    public static void main(String[] args) {
        System.out.println("welcome to file reader");

        try (FileReader reader = new FileReader("java.course.txt")){
            int ch;
            while ((ch = reader.read()) != -1){
                System.out.print((char)ch);
            }
        }catch (Exception e){
            System.out.printf("Error exception %s",e.getMessage());
        }
    }
}
