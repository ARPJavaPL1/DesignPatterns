package designpatterns.strategy.calculator;

public class DivideCalculationStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
