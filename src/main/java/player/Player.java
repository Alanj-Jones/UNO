package src.main.java.player;

import java.util.stream.Stream;

import src.main.java.card.ICard;

public class Player {

    public Player(String name, HandCardList hand) {
        this.name= name;
        this.handCards = hand;
    }

    public String getName() {
        return "";
    }

    public Stream<ICard> getHandCards() {
        return null;
        
    }

    public void addToHandCards(ICard card) {

    }

    public boolean removePlayedCard(ICard card) {
        return true;
    }

    public boolean hasHandCard(ICard card) {
        return true;
    }

    /*
    public ImmutablePlayer toImmutable() {
        return null;
    }
    */



    private final String name;
    private final HandCardList handCards;
}
