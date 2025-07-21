package CHALLANGES.lecture_code.src.in.kgcoding.FileHandling;//this code is the proof you can do it

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Fileshower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to File Opener!!");
        System.out.println("enter the file name");
       String filename = input.next();
       int read = 0;
       try(FileReader reader = new FileReader(filename)){
           do{
               read = reader.read();
               System.out.print((char) read);

           }while(read!=-1);
       }catch (FileNotFoundException exception){
           System.out.printf("%s File not found!!Enter valid file name that exists!!",filename);

       }catch (IOException exception){
           System.out.printf("exception occured %s",exception.getMessage());
       }
    }
}

     //  try(FileReader reader = new FileReader(filename)){
       //    int read;
         //  while((read=reader.read())!= -1){
           //    system.out.println(char)read);
      //  } catch(FileNotFoundException exception){
        //       soutpf("file not found %s",filename);
        //}
          // catch(IOException exception){
            //   soutpf("exception occured %s",exception.getmessage);

        //}


        //}
        //}
