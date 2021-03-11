package main.java.card;

import java.util.Objects;

public class WildCard extends AbstractCard {

    public WildCard(CardType type) {
        super(type, null);
    }

    public WildCard(CardType type, CardColor color) {
        super(type, color);
        CardUtil.validateColor(color);
        
    }

    @Override
    public boolean equals(Object o) {
        return (this == o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(),getColor());
    }

    @Override
    public String toString() {
        return "Wild Card{" +
                getType() + ", " +
                getColor() + "}";
    }    
    
}
