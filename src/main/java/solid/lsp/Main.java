package solid.lsp;

public class Main {

    public static void main(String[] args) {
        Basenji basenji = new Basenji();
        basenji.move();

        Dog dog = new NonBarkingDog();
        Dog dog2 = new BarkingDog();
    }
}
