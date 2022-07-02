package designpatterns.decorator.coffee;

public class Mleko extends SkladnikNapojuDekorator {
    private Napoj napoj;

    public Mleko(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 1.23f;
    }

    @Override
    public String opis() {
        return napoj.opis() + ", mleko";
    }
}
