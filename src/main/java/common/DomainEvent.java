package common;

import java.util.Date;

public abstract class DomainEvent {

    protected DomainEvent() {
        occurredDate = new Date();
    }

    public Date getOccurredDate() {
        return occurredDate;
    }

    private final Date occurredDate;
}
