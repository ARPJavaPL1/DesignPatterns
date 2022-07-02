package designpatterns.singleton;

public class Singleton5 {
    private static Singleton5 instance;

    public static Singleton5 getInstance() {

        synchronized (Singleton5.class) {
            if (instance == null) {

                synchronized (Singleton5.class) {
                    instance = new Singleton5();
                }
            }
            return instance;
        }
    }

    private Singleton5() {

    }
}
