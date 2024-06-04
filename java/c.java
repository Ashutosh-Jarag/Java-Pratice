import java.io.*;
import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;


public class c {
    public static void main(String[] args) {
        try{
          FileWriter f = new FileWriter("new.txt");
          f.write("EXTERNAL PROCESS KILLED SUCCESFULLY");
          f.close();
          System.out.println("suceess");

        }catch (IOException e){
            System.out.println("error");
        }

    }
}
