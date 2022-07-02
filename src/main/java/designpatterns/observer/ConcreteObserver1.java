package designpatterns.observer;

public class ConcreteObserver1 implements Observer {
    @Override
    public void update(SubjectState subjectState) {
        System.out.println(this.getClass().getSimpleName() + " update");
    }
}
