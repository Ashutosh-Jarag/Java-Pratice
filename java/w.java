import java.io.*;
import java.io.IOException;
import java.io.File;


public class w {
    public static void main(String[] args) {
        try{
            File f = new File("new.txt");
            if (f.createNewFile()) {
                System.out.println("file crated ");
                
            }
            else{
                System.out.println("alreday aahe");
            }

        }catch (IOException e){
            System.out.println("error");
        }

    }
}
