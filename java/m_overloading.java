public class m_overloading {
    static int add(int a, int b){
        return a+b;
    }
    
    static double add(double a, double b){
        return a+b;

    }

    public static void main(String[] args){
        int n1=add(2,3);
        double n2 =add(2,3);
        System.out.println(n1);
        System.out.println(n2);
    }
}
