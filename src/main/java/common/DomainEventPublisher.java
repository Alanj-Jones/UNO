package common;

import java.util.ArrayList;
import java.util.List;

public class DomainEventPublisher {

    private DomainEventPublisher() {}

    public static void subscribe(DomainEventSubscriber subscriber) {
        if (Boolean.TRUE.equals(isPublishing.get())) {
            return;
        }

        List<DomainEventSubscriber> registeredSubscribers = subscribers.get();
        registeredSubscribers.add(subscriber);
    }

    public static void unsubscribe(DomainEventSubscriber unsuscriber) {
        if (Boolean.TRUE.equals(isPublishing.get())) {
            return;
        }

        subscribers.get().remove(unsuscriber);
    }

    public static void publish(DomainEvent event) {
        if (Boolean.TRUE.equals(isPublishing.get())) {
            return;
        }

        try {
            isPublishing.set(true);

            var registeredSubscribers = subscribers.get();

            for (var subscriber : registeredSubscribers) {
                subscriber.handleEvent(event);
            }
        } finally {
            isPublishing.set(Boolean.FALSE);
        } 
    }

    public static void reset() {
        isPublishing.remove();
        subscribers.remove();
    }

    private static final  ThreadLocal<List<DomainEventSubscriber>> subscribers = ThreadLocal.withInitial(ArrayList::new);
    private static final ThreadLocal<Boolean> isPublishing = ThreadLocal.withInitial(() -> Boolean.FALSE);



}
