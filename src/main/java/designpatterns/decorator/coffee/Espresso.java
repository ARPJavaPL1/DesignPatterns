package designpatterns.decorator.coffee;

public class Espresso extends Napoj {
    @Override
    public double koszt() {
        return 9.99f;
    }

    @Override
    public String opis() {
        return "Espresso";
    }
}
