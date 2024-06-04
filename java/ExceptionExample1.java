public class ExceptionExample1 {
    public static void main(String[] args) {
        try {
            // Division by zero exception
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line will not execute due to the exception
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Array index out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: Invalid number format");
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }
    }
}
