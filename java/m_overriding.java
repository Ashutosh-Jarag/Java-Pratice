
class animal{
    void eat(){
        System.out.println("eating");;
    }

}
class dog extends animal{
    void eat(){
        System.out.println("dog is eating");
    }
}
public class m_overriding {
    public static void main(String args[]){
    dog d=new dog();
    animal a=new animal();
    
    d.eat();
    a.eat();
    
    animal a1=new dog();
    a1.eat();
}
}