public class m_overloading2 {
    static int add(int a, int b){
    return a*b;
    }

    static int add(int a, int b, int c){
        return a*b*c;
    }


public static void main(String args[]){
    System.out.println(add(10,2));
    System.out.println(add(3,3,3));
}
}