package designpatterns.strategy;

public class Application {
    public static void main(String[] args) {

        MediaFile video = new MediaFile(new PlayVideo());
        video.play();

        video.setPlayBehaviour(new PlayAnimation());
        video.play();
    }
}
