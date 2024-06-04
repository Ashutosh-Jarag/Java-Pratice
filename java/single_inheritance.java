class Parent{
    public void eat(){
        System.out.println("eating");
    }
}

class Child extends Parent{
    public void sleep(){
        System.out.println("sleeping");
    }
}

public class single_inheritance{
    public static void main(String [] args){
        Child c= new Child();
        c.eat();
        c.sleep();
    }
}