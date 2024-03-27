public class Decorator implements iCalculableComplex{
    private CalculatorComplex oldCalculator;
    private Logger logger;

    public Decorator(CalculatorComplex oldCalculator, Logger logger) {
        this.oldCalculator = oldCalculator;
        this.logger = logger;
    }

    @Override
    public iCalculableComplex sum(ComplexNumber number1) {
        ComplexNumber firstArg = oldCalculator.getResult();
        logger.log(String.format("Первое значение калькулятора %s. Начало вызова метода sum с параметром %s", firstArg, number1));
        iCalculableComplex result = oldCalculator.sum(number1);
        logger.log(String.format("Вызов метода sum произошел"));
        return result;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = oldCalculator.getResult();
        logger.log(String.format("Получение результата %s", result));
        return result;
    }
}
