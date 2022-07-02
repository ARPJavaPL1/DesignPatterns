package designpatterns.adapter.numbers;

public class DoubleToIntAdapter implements Adapter {
    private DoubleClass doubleClass = new DoubleClass();

    @Override
    public int getValue() {
        return (int)Math.round(doubleClass.getValue());
    }
}
