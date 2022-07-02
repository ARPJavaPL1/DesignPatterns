package designpatterns.observer;

public class ConcreteObserver2 implements Observer {
    @Override
    public void update(SubjectState subjectState) {
        System.out.println(this.getClass().getSimpleName() + " update");
    }
}
