public class App {
    public static void main(String[] args) {
        iCalculableComplex calcOld = new CalculatorComplex(0,0);
        iCalculableComplex decorator = new Decorator(new CalculatorComplex(0,0), new Logger());
        ViewComplexCalculator view = new ViewComplexCalculator(decorator);
        view.run();

    }
}
