package src.main.java.card;

import java.util.Objects;

public class NumberCard extends AbstractCard{

    public NumberCard(CardColor color, int number) {
        super(CardType.NUMBER, color);
        CardUtil.validateColor(color);
        CardUtil.validateNumber(number);
        this.value = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getType(),getColor(),getValue());
    }

    @Override
    public String toString() {
        return "Card {" +
                getType() + ", " +
                getColor() + ", " +
                getValue() + "}" ;

    }

    public int getValue() {
        return this.value;
    }

    private final int value;
    
}
