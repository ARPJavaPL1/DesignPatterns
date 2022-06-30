package designpatterns.strategy;

public class PlayVideo implements PlayBehaviour {
    @Override
    public void play() {
        System.out.println("play video");
    }
}
