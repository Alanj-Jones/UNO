package src.main.java.card;

import java.util.Objects;

public class ActionCard extends AbstractCard {

    public ActionCard(CardType type, CardColor color) {
        super(type, color);
        CardUtil.validateActionType(type);
        CardUtil.validateColor(color);
    }

    @Override
    public boolean equals(Object o) {
        return o == this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getType());
    }

    @Override
    public String toString() {
        return "Action Card {" + 
                getColor() + ", " +
                getType() + "}" ;
    }
    
}
