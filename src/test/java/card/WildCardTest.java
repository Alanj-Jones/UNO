package card;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class WildCardTest {
    
    @BeforeEach
    void setup() {
        wCard = new WildCard(CardType.WILD_COLOR, CardColor.BLUE);
    }

    @Test
    public void testEquals() {
        assertTrue(wCard.equals(new WildCard(CardType.WILD_COLOR, CardColor.BLUE)));
    }

    @Test
    public void testNotEquals() {
        assertFalse(wCard.equals(new WildCard(CardType.WILD_DRAW_FOUR, CardColor.RED)));
    }

    @Test
    public void testHash() {
        int hash = Objects.hash(wCard.getColor(), wCard.getType());
        assertEquals(hash, wCard.hashCode());
    }

    @Test
    public void toStringTest() {
        assertEquals(   "Wild Card{" +
                        wCard.getType() + ", " +
                        wCard.getColor() + "}", 
                        wCard.toString());
    }

    @Test
    public void cardTypeTest() {
        //Wild Color
        assertEquals(CardType.WILD_COLOR, wCard.getType());
        //Wild +4
        wCard = new WildCard(CardType.WILD_DRAW_FOUR);
        assertEquals(CardType.WILD_DRAW_FOUR, wCard.getType());
    }

    private WildCard wCard;
}
