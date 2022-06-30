package designpatterns.strategy;

public class PlayAnimation implements PlayBehaviour {
    @Override
    public void play() {
        System.out.println("play animation");
    }
}
