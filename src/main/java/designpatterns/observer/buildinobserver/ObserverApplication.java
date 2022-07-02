package designpatterns.observer.buildinobserver;

import java.util.Observable;

public class ObserverApplication {
    public static void main(String[] args) {
        Observable observable = new ConcreteSubject();
        observable.addObserver(new ConcreteObserver());

        observable.notifyObservers();
    }
}
