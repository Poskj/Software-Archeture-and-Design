package edu.parinya.softarchdesign.behavioral;

import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;
import java.util.HashSet;

public class NewsPublisher implements Publisher<News> {
	private HashSet<Subscriber<? super News>>subscribers = new HashSet<>();


    @Override

    public void subscribe(Subscriber<? super News> subscriber) {
        subscribers.add(subscriber);
    }
    public void unsubscribe(Subscriber<? super News> subscriber) {
        subscribers.remove(subscriber);
    }
    public void publish(News news) {
        for (Subscriber<? super News> subscriber : subscribers) {
            subscriber.onNext(news);
        }
    }


}
