package designpatterns.singleton;

public class Singleton4 {

    private static Singleton4 instance;

    public synchronized static Singleton4 getInstance() {
        if (instance == null) {
            instance = new Singleton4();
        }
        return instance;
    }

    private Singleton4() {

    }
}
