package designpatterns.factory.simplefactory;

public class Volvo extends Car {
    @Override
    public void start() {
        System.out.println("start " + getClass().getSimpleName());
    }

    @Override
    public void accelerate() {
        System.out.println("accelerate " + getClass().getSimpleName());
    }

    @Override
    public void stop() {
        System.out.println("stop " + getClass().getSimpleName());
    }
}
