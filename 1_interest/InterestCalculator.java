public class InterestCalculator {
    
    public static double calculateCompoundInterest(double principal, double rate, int time) {
        // Formula for compound interest
        double amount = principal * Math.pow(1 + (rate / 100), time);
        double compoundInterest = amount - principal;
        return compoundInterest;
    }
    
    public static void main(String[] args) {
        double principal = 1000; // Principal amount
        double rate = 5; // Annual interest rate (in percentage)
        int time = 3; // Time period (in years)
        
        // Calculate compound interest
        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        
        // Display the result
        System.out.println("Principal: $" + principal);
        System.out.println("Rate of interest: " + rate + "%");
        System.out.println("Time period: " + time + " years");
        System.out.println("Compound Interest: $" + compoundInterest);
    }
}
