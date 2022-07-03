package designpatterns.factory.factorymethod.pizza.product;

// PRODUKT
public abstract class Pizza {

    private String nazwa;
    private String ciasto;

    public Pizza(String nazwa, String ciasto) {
        this.nazwa = nazwa;
        this.ciasto = ciasto;
    }

    public void przygotowanie() {
        System.out.println("przygotowanie " + nazwa + " " + ciasto);
    }

    public void pieczenie() {
        System.out.println("pieczenie " + nazwa + " " + ciasto);
    }

    public void krojenie() {
        System.out.println("krojenie " + nazwa + " " + ciasto);
    }

    public void pakowanie() {
        System.out.println("pakowanie " + nazwa + " " + ciasto);
    }

    public String pobierzNazwa() {
        return nazwa;
    }
}
