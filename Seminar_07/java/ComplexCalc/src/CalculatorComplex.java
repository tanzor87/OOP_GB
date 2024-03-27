public class CalculatorComplex implements iCalculableComplex{
    private int primaryArgRe;
    private int primaryArgIm;

    public CalculatorComplex(int primaryArgRe, int primaryArgIm) {
        this.primaryArgRe = primaryArgRe;
        this.primaryArgIm = primaryArgIm;
    }

    @Override
    public iCalculableComplex sum(ComplexNumber number) {
        primaryArgRe += number.getNumRe();
        primaryArgIm += number.getNumIm();

        return this;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = new ComplexNumber(primaryArgRe, primaryArgIm);
        return result;
    }
}