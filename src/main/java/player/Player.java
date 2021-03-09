package src.main.java.player;

import java.util.UUID;
import java.util.stream.Stream;

import src.main.java.card.CardUtil;
import src.main.java.card.ICard;

public class Player extends Entity{

    public Player(String name, HandCardList hand) {
        super();
        this.name= name;
        this.handCards = hand;
    }

    public String getName() {
        return name;
    }

    public Stream<ICard> getHandCards() {
        return handCards.getCardStream();        
    }

    public void addToHandCards(ICard card) {
        handCards.addCard(card);
    }

    public boolean removePlayedCard(ICard card) {
        return handCards.removeCard(card);                
    }

    public boolean hasHandCard(ICard card) {
        return handCards.hasCard(card);
    }

    /*
    public ImmutablePlayer toImmutable() {
        return null;
    }
    */



    private final String name;
    private final HandCardList handCards;
}
