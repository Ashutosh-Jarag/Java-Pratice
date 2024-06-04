public class interestcons {
    double p;
    double r;
    int t;

    public interestcons(double p, double r, int t){
        this.p= p;
        this.r= r;
        this.t=t;
    }

    public  double calculate(){
        double simple=(p*r*t)/100;
        return simple;


    }

    public static void main(String[] args) {
        interestcons s= new interestcons(1000,5,2);
        double interest = s.calculate();
        System.out.println(interest);
    }



    }

    

