public class interest_12 {
    public static double calculate(double p, double r, double t){
        return (p*r*t)/100;
    }

    public static void main(String[] args) {
        double p=100;
        double r =5;
        double t=2;


        double simple= calculate(p, r, t);

        System.out.println(simple);
    }
    
}
