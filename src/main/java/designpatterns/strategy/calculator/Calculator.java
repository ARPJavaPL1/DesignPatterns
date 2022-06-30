package designpatterns.strategy.calculator;

public class Calculator {

    public static void main(String[] args) {
        // wykorzystując wzorzez Strategia zmienić
        // poniższy kod w taki sposób, by każde
        // działanie matematyczne było zaimplementowane
        // w oddzielnej konkretnej strategii

        String operator = "+";
        int a = 2;
        int b = 5;
        int rezultat = 0;

        if (operator.equals("+")) {
            rezultat = a + b;
        } else if (operator.equals("-")) {
            rezultat = a - b;
        } else if (operator.equals("*")) {
            rezultat = a * b;
        } else if (operator.equals("/")) {
            rezultat = a / b;
        }

        System.out.println(rezultat);

        CalculationContext context
                = new CalculationContext(new SumCalculationStrategy());

        try {
            System.out.println(context.calculate(a, b));

            context.setStrategy(new MinusCalculationStrategy());
            System.out.println(context.calculate(a, b));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
