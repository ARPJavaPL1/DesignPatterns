package designpatterns.strategy.calculator;

public class MultiplyCalculationStrategy implements CalculationStrategy {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
