package src.main.java.player;

import java.util.UUID;

public class Entity {
    public Entity(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    private final UUID id;
}
