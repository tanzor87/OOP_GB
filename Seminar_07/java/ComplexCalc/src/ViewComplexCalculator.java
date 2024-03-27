import java.util.Scanner;

public class ViewComplexCalculator {
    private iCalculableComplex calculator;

    public ViewComplexCalculator(iCalculableComplex calculator) {
        this.calculator = calculator;
    }

    public void run(){
        while (true) {
            int numReal1 = promptInt("Введите действительную часть первого аргумента: ");
            int numImag1 = promptInt("Введите мнимую часть первого аргумента: ");
            ComplexNumber num1 = new ComplexNumber(numReal1, numImag1);
            calculator.sum(num1);
            while (true) {
                String cmd = prompt("Введите команду (*, +, =) : ");
                if (cmd.equals("+")) {
                    int numReal2 = promptInt("Введите действительную часть второго аргумента: ");
                    int numImag2 = promptInt("Введите мнимую часть второго аргумента: ");
                    ComplexNumber num2 = new ComplexNumber(numReal2, numImag2);
                    calculator.sum(num2);
                    continue;
                }
                if (cmd.equals("=")) {
                    ComplexNumber result = calculator.getResult();
                    System.out.println("Результат = " + result);
                    break;
                }
            }
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y")) {
                continue;
            }
            break;
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
