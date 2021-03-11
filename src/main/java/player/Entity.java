package main.java.player;

import java.util.UUID;

public class Entity {
    
    protected Entity() {
        this(UUID.randomUUID());
    }

    protected Entity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    private final UUID id;
}