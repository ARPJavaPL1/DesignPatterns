package designpatterns.observer.buildinobserver;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserver implements Observer {
    @Override
    public void update(Observable observable, Object o) {

        // TODO: update is not executed
        System.out.println();
    }
}
