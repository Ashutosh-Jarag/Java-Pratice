//import java.io.*;
public interface interface_3 {
    int a=10;
    void display();

} 
class Class1 implements interface_3 {
    public void display(){
        System.out.println("interface");
    }
    public static void main(String[] args){
        Class1 c=new Class1();
        c.display();
        System.out.println(a);
    }

    
}
