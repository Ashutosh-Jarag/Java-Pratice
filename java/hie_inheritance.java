class A{
    public void parent(){
        System.out.println("this is parent class");
    }
}

class B extends A{
    public void child1(){
        System.out.println("this is chil no 1 of parent");

    }
}
class C extends A{
    public void child2(){
        System.out.println("this is chil no 2 of parent ");

    }
}
class D extends A{
    public void child3(){
        System.out.println("this is chil no 3 parent");

    }
}



public class hie_inheritance {
    public static void main(String [] args){
        B b=new B();
        b.child1();

        C c=new C();
        c.child2();

        D d=new D();
        d.child3();
    }
}
