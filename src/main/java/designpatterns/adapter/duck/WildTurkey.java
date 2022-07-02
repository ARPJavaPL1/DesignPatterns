package designpatterns.adapter.duck;

public class WildTurkey implements Turkey {
    @Override
    public void gulg() {
        System.out.println("gulg");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
