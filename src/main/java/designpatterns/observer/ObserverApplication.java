package designpatterns.observer;

public class ObserverApplication {
    public static void main(String[] args) {

        Subject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver1();
        Observer observer2 = new ConcreteObserver2();

        subject.attach(observer1);
        subject.notifyStateChange();

        System.out.println();
        System.out.println();

        subject.attach(observer2);
        subject.notifyStateChange();

        System.out.println();
        System.out.println();

        subject.detach(observer1);
        subject.notifyStateChange();
    }
}
