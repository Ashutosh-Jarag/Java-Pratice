class Parent{
    public void parent(){
        System.out.println("I am the parent here");
    }
}
class child1 extends Parent{
    public void child1(){
        System.out.println(" I am the child");
    }
}
class child2 extends child1{
    public void child2(){
        System.out.println("I am brother of child1");
    }
}
class child3 extends Parent{
    public void child3(){
        System.out.println("I am 3rd child of parent");
    }
}
class child4 extends Parent{
    public void child4(){
        System.out.println("I am 4th child of parent");

    }
}
public class inheritance_2 {
    public static void main(String[] args) {
    
    System.out.println("single");
    child1 c1=new child1();
    c1.parent();
    c1.child1();

    //multilevel 
    System.out.println("multilevel");
    child2 c2=new child2();
    c2.parent();
    c2.child1();
    c2.child2();

    //hie
    System.out.println("Hie");
    child3 c3=new child3();
    c3.child3();

    child4 c4=new child4();
    c4.child4();


    }
    
}
