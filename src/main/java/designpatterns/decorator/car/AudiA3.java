package designpatterns.decorator.car;

public class AudiA3 extends Car {
    @Override
    public double price() {
        return 150000f;
    }

    @Override
    public String description() {
        return "Audi A3";
    }
}
