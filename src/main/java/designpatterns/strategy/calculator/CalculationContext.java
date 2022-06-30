package designpatterns.strategy.calculator;

public class CalculationContext {

    private CalculationStrategy strategy;

    public CalculationContext(CalculationStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculate(int a, int b) throws Exception {
        if (strategy != null) {
            return strategy.calculate(a, b);
        }

        throw new Exception("Strategy is not set");
    }

    public void setStrategy(CalculationStrategy strategy) {
        this.strategy = strategy;
    }
}
