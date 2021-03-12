package player;

import java.util.Arrays;
import java.util.UUID;
import java.util.stream.Stream;

public class PlayerRoundIterator {
    
    public PlayerRoundIterator(Player[] players) {
        this.players = players;
    }

    public Stream<Player> stream() {
        return Arrays.stream(players);
    }

    public Player getCurrentPlayer() {
        return players[current];
    }

    public Player getPlayerById(UUID id) {
        for (Player player : players) {
            if (player.getId().equals(id)) {
                return player;
            }
        }
        return null;
    }

    public void reverseDirection() {
        if (direction.equals(Direction.CLOCKWISE)) {
            direction = Direction.COUNTER_CLOCKWISE;
        } else {
            direction = Direction.CLOCKWISE;
        }
    }

    public Player next() {
        current = getNextIndex();
        return getCurrentPlayer();
    }

    private int getNextIndex() {
        int increment;
        if (direction == Direction.CLOCKWISE) {
            increment = 1;
        } else {
            increment = -1;
        }
        return (players.length + current + increment) % players.length;
    }

    private final Player[] players;
    private int current = 0;
    private Direction direction = Direction.CLOCKWISE;
}
