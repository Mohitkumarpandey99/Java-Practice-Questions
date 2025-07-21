package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class  Filewritingex1 {
    public static void main(String[] args) {
        String filename = "java-course.txt";

        try (FileWriter writer = new FileWriter(filename)){
            writer.write("my name is mohit");
            writer.flush();
            System.out.println("File writing successfully happend");
        }catch (IOException exception){
            System.out.printf("exception occured: %s ",exception.getMessage());

        }
    }
}
