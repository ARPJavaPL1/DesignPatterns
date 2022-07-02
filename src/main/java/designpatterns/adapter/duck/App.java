package designpatterns.adapter.duck;

public class App {
    public static void main(String[] args) {
        WildDuck wildDuck = new WildDuck();
        wildDuck.kwack();
        wildDuck.fly();

        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.gulg();
        wildTurkey.fly();

        Duck duck = new TurkeyAdapter(wildTurkey);
        duck.kwack();
        duck.fly();
    }
}
