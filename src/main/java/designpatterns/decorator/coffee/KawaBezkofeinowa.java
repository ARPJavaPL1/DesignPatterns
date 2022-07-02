package designpatterns.decorator.coffee;

public class KawaBezkofeinowa extends Napoj {
    @Override
    public double koszt() {
        return 8.99f;
    }

    @Override
    public String opis() {
        return "Kawa bezkofeinowa";
    }
}
