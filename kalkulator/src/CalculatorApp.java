public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result1 = calculator.addition(10,2);
        int result2 = calculator.substraction(result1, 5);

        System.out.println("(10 + 2) = " + result1);
        System.out.println("(10 + 2) -  5 = " + result2);
    }
}
