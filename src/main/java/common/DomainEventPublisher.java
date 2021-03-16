package common;

import java.util.List;

public class DomainEventPublisher {

    private void subscribe(DomainEventSubscriber subscriber) {

    }

    private void unsubscribe(DomainEventSubscriber unsuscriber) {

    }

    private void publish(DomainEvent event) {

    }

    private void reset() {
        
    }



    private final  ThreadLocal<List<DomainEventSubscriber>> subscribers;
    private final ThreadLocal<Boolean> isPublishing;

}
