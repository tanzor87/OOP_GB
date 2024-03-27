public class App {
    public static void main(String[] args) {
        iCalculableComplex calcOld = new CalculatorComplex(0,0);
//        iCalculableComplex decorator = new
        ViewComplexCalculator view = new ViewComplexCalculator(calcOld);
        view.run();

    }
}
