package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private int value1;
    private String value2;
    private double value3;

    private List<Observer> observers;

    public ConcreteSubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void attach(Observer observer) {
        if (observers.contains(observer)) {
            System.out.println("Observer already exists");
            return;
        }

        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyStateChange() {
        SubjectState subjectState = new SubjectState();
        subjectState.setValue1(value1);
        subjectState.setValue2(value2);
        subjectState.setValue3(value3);

        for (Observer observer : observers) {
            observer.update(subjectState);
        }
    }
}
