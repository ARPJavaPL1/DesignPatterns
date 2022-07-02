package designpatterns.adapter.duck;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void kwack() {
        turkey.gulg();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
