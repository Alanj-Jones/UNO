package card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {  
    public CardDeck() {
        createCards();
    }

    public List<ICard> getImmutableCards() {
        return Collections.unmodifiableList(cards);
    }

    public void createCards() {
        createNumberCards();
        createActionCards();
        createWildCards();
    }

    public void createNumberCards() {
        for (var color : CardColor.values()) { //Uso var para no redefinirlo como CardColor
            cards.add(new NumberCard(color, 0));
            for (int i=1; i<=9; i++) {
                cards.add(new NumberCard(color, i));
                cards.add(new NumberCard(color, i));
            }
        }
    }

    public void createActionCards() {
        for (CardColor color : CardColor.values()) {
            for (int i=0; i<2; i++) {
                cards.add(new ActionCard(CardType.DRAW_TWO, color));
                cards.add(new ActionCard(CardType.SKIP, color));
                cards.add(new ActionCard(CardType.REVERSE, color));
            }            
        }
    }

    public void createWildCards() {
        for (int i=0; i<4; i++) {
            cards.add(new WildCard(CardType.WILD_COLOR));
            cards.add(new WildCard(CardType.WILD_DRAW_FOUR));

        }
    }

    private final List<ICard> cards = new ArrayList<>(108); //108 cards total
}
