package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReading {
    public static void main(String[] args) {
        String filename = "java-course.txt";

        try(FileReader reading = new FileReader(filename)){
            int read = 0;
            do{
                read=reading.read();
                System.out.print((char) read);
            }while (read != -1);

        }catch (IOException exception){
            System.out.printf("exception found!! %S", exception.getMessage());
        }
    }


}
