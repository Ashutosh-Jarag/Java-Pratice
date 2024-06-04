import java.io.File;
import java.io.IOException;

public class create{
    public static  void main(String[] args){
        try{
            File f=new File("sample.txt");
            if(f.createNewFile()){
                System.out.println("file created");
            }
            else{
                System.out.println("already aahe ");
            }
        }
        catch(IOException e){
            System.out.println("error");
        }
    }

}

