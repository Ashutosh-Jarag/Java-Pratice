class A{
    public void first(){
        System.out.println("GrandParent");
    }
}

class B extends A{
    public void second(){
        System.out.println("parent");
    }
}

class C extends B{
    public void third(){
        System.out.println("child");
    }
}

public class multilevel_inheritance {
    public static void main(String[] args){
        
        C c=new C();

        c.first();
        c.second();
        c.third();
    }
    
}
