package dev.srivatsan.observerpattern.observable;

import dev.srivatsan.observerpattern.observer.Observer;

// Observable Interface
public interface Subject {
    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers(String message);
}
