package player;

import java.io.Serializable;
import java.util.UUID;
import java.util.stream.Stream;

import card.ICard;

public class ImmutablePlayer implements Serializable {
    private final Player player;

    public ImmutablePlayer(Player player) {
        this.player = player;
    }

    public UUID getId() {
        return player.getId();
    }

    public String getName() {
        return player.getName();
    }

    public Stream<ICard> getHandCards() {
        return this.player.getHandCards();
    }

    public int getTotalCards() {
        return (int) getHandCards().count();
    }
}