package designpatterns.observer.weatherstation;

// Obserwowany
public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyStateChange();
}
