package designpatterns.adapter;

public class ConcreteAdapter implements Adapter {
    private Adaptee adaptee;

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void operation() {
        adaptee.differentOperation();
    }
}
