package src.main.java.player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import src.main.java.card.CardType;
import src.main.java.card.ICard;

public class HandCardList {

    public HandCardList() {
        this.handCards = new ArrayList<ICard>();
    }

    public void addCard(ICard card) {

    }

    public boolean removeCard(ICard card) {

        return true;
    }

    private ICard findCardOfType(CardType type) {

        return null;
    }

    public Stream<ICard> getCardStream() {
        return null;
    }

    public boolean hasCard(ICard card) {

        return true;
    }

    public int size() {
        return 0;

    }

    private final List<ICard> handCards;
}