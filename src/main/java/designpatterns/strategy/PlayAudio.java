package designpatterns.strategy;

public class PlayAudio implements PlayBehaviour {
    @Override
    public void play() {
        System.out.println("play audio");
    }
}
