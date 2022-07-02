package designpatterns.decorator.coffee;

public class CoffeeApp {
    public static void main(String[] args) {
        Napoj napoj =
                new Cukier(new Cukier(new Mleko(new KawaBezkofeinowa())));

        System.out.println(napoj.opis());
        System.out.printf("%7.2f\n", napoj.koszt());
    }
}
