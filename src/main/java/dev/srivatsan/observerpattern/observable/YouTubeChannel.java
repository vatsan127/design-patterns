package dev.srivatsan.observerpattern.observable;

import dev.srivatsan.observerpattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {

    private final List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);  // Notify all subscribers
        }
    }

    // New video uploaded
    public void uploadNewVideo(String videoTitle) {
        System.out.println("New Video Uploaded: " + videoTitle);
        notifyObservers("New video available: " + videoTitle);
    }
}
