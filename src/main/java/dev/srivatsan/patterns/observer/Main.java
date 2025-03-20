package dev.srivatsan.patterns.observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel techChannel = new YouTubeChannel();

        Observer alice = new Subscriber("Alice");
        Observer bob = new Subscriber("Bob");

        techChannel.subscribe(alice);
        techChannel.subscribe(bob);

        // Uploading a new video (this will notify all subscribers)
        techChannel.uploadNewVideo("Observer Pattern in Java");

        // Bob unsubscribes
        techChannel.unsubscribe(bob);

        // Uploading another video
        techChannel.uploadNewVideo("Strategy Pattern Explained");
    }
}