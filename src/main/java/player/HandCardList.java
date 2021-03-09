package src.main.java.player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import src.main.java.card.CardType;
import src.main.java.card.CardUtil;
import src.main.java.card.ICard;

public class HandCardList {

    public void addCard(ICard card) {
        handCards.add(card);
    }

    public boolean removeCard(ICard card) {
        ICard cardToRemove = CardUtil.isWildCard(card) ? findCardOfType(card.getType()) : card;
        return handCards.remove(cardToRemove);
    }

    private ICard findCardOfType(CardType type) {
        for (ICard currentCard : handCards) {
            if (currentCard.getType() == type) {
                return currentCard;
            }
        }

        return null;
    }

    public Stream<ICard> getCardStream() {
        return handCards.stream();
    }

    public boolean hasCard(ICard card) {
        return CardUtil.isWildCard(card) ?
                    getCardStream().anyMatch(c -> c.getType() == card.getType()) :
                    getCardStream().anyMatch(c -> c.equals(card));
    }

    public int size() {
        return handCards.size();
    }

    private final List<ICard> handCards = new ArrayList<ICard>();
}