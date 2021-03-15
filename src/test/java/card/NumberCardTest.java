package card;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberCardTest {
    
    @BeforeEach
    void setup() {
        nCard = new NumberCard(CardColor.RED, 9);
    }

    @Test
    public void equalsTest() {
        assertTrue(nCard.equals(new NumberCard(CardColor.RED, 1)));
    }

    @Test
    public void notEqualsTest() {
        assertFalse(nCard.equals(new NumberCard(CardColor.RED, 2)));
    }

    @Test
    public void toStringTest() {
        assertEquals(   "Card {" +
                        nCard.getType() + ", " +
                        nCard.getColor() + ", " +
                        nCard.getValue() + "}" , 
                        nCard.toString());
    }

    @Test
    public void hashTest() {
        int hash = Objects.hash(nCard.getType(),nCard.getColor(),nCard.getValue());
        assertEquals(hash, nCard.hashCode());
    }

    @Test
    public void numberValuesTest() {
        assertEquals(9, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 8);
        assertEquals(8, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 7);
        assertEquals(7, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 6);
        assertEquals(6, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 5);
        assertEquals(5, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 4);
        assertEquals(4, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 3);
        assertEquals(3, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 2);
        assertEquals(2, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 1);
        assertEquals(1, nCard.getValue());

        nCard = new NumberCard(CardColor.RED, 0);
        assertEquals(0, nCard.getValue());
    }
    private NumberCard nCard;
}
