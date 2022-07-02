package designpatterns.adapter.duck;

public class WildDuck implements Duck {
    @Override
    public void kwack() {
        System.out.println("kwack");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
