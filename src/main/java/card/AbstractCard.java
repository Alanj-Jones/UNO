package src.main.java.card;

public abstract class AbstractCard implements ICard{

    public AbstractCard(CardType type, CardColor color) {
        this.color = color;
        this.type = type;
    }

    @Override
    public CardType getType() {
        return type;
    }

    @Override
    public CardColor getColor() {
        return color;
    }

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();

    
    private final CardType type;
    private final CardColor color;
}
