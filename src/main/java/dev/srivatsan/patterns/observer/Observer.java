package dev.srivatsan.patterns.observer;

// Observer Interface
public interface Observer {
    void update(String message);  // Method to receive updates
}

class Subscriber implements Observer {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }
}

