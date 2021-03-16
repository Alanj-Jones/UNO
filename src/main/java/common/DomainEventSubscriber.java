package common;

public interface DomainEventSubscriber {
    void handleEvent(DomainEvent dEvent);
}
