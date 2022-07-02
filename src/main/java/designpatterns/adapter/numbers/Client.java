package designpatterns.adapter.numbers;

public class Client {

    Adapter adapter = new DoubleToIntAdapter();

    public int getValue() {
        return adapter.getValue();
    }
}
