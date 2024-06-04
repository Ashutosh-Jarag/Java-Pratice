import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
public class write {
    public static void main(String[] args){
        try{
            FileWriter w= new FileWriter("sample.txt");
            w.write("HI");
            w.close();
            System.out.println("success");
        }
        catch(IOException e){
            System.out.println("errorrr");
        }
    }
    
}
