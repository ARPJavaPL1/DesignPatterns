package designpatterns.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        Singleton1 singleton11 = Singleton1.getInstance();
        Singleton1 singleton12 = Singleton1.getInstance();

        if (singleton11 == singleton12) {
            System.out.println("are the same");
        } else {
            System.out.println("are not the same");
        }

        Singleton3 singleton31 = Singleton3.getInstance();
        Singleton3 singleton32 = Singleton3.getInstance();

        if (singleton31 == singleton32) {
            System.out.println("are the same");
        } else {
            System.out.println("are not the same");
        }

        Singleton7 singleton71 = Singleton7.INSTANCE;
        Singleton7 singleton72 = Singleton7.INSTANCE;

        if (singleton71 == singleton72) {
            System.out.println("are the same");
        } else {
            System.out.println("are not the same");
        }
    }
}
