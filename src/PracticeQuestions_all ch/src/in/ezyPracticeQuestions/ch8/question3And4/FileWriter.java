package PracticeQuestions_all;

import java.io.IOException;

public class FileWriter {
    public static void main(String[] args) {
         String fileName = "java.course.txt";
         try (java.io.FileWriter writer = new java.io.FileWriter(fileName)){
             writer.write("my name is mohit");
             writer.flush();
             System.out.println("successfully written");
         } catch (IOException e) {
             System.out.printf("Exception error: %s",e.getMessage());
         }
    }
}
