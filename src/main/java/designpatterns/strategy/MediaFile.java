package designpatterns.strategy;

public class MediaFile {

    private PlayBehaviour playBehaviour;

    public MediaFile(PlayBehaviour playBehaviour) {
        this.playBehaviour = playBehaviour;
    }

    public void play() {
        if (playBehaviour != null) {
            playBehaviour.play();
        }
    }

    public void compress() {
        // TODO:
    }

    public void setPlayBehaviour(PlayBehaviour playBehaviour) {
        this.playBehaviour = playBehaviour;
    }
}
