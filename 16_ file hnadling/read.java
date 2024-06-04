import java.io.File;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.util.Scanner;
public class read {
    public static void main(String[] args){
        try{

        
        File f=new File("sample.txt");
        Scanner s=new Scanner(f);
        
        }catch(FileNotFoundException e){
            System.out.println("eroorrrrrr");
        }
    }
    
}
