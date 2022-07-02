package designpatterns.decorator.coffee;

public class Cukier extends SkladnikNapojuDekorator {
    private Napoj napoj;

    public Cukier(Napoj napoj) {
        this.napoj = napoj;
    }

    @Override
    public double koszt() {
        return napoj.koszt() + 0.99f;
    }

    @Override
    public String opis() {
        return napoj.opis() + ", Cukier";
    }
}
