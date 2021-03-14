import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Objects;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import card.ActionCard;
import card.CardColor;
import card.CardType;

public class ActionCardTest {


    @BeforeEach
    void setup() {
        aCard = new ActionCard(CardType.DRAW_TWO, CardColor.YELLOW);
    }

    @Test
    public void toStringTest() { 
        assertEquals(   "Action Card {" + 
                        CardColor.YELLOW + ", " +
                        CardType.DRAW_TWO + "}" ,
                        aCard.toString());
    }
    @Test
    public void testCardColor() {
        //Yellow
        assertEquals(CardColor.YELLOW, aCard.getColor());
        //Blue
        aCard = new ActionCard(CardType.DRAW_TWO, CardColor.BLUE);
        assertEquals(CardColor.BLUE, aCard.getColor());
        //Red
        aCard = new ActionCard(CardType.DRAW_TWO, CardColor.RED);
        assertEquals(CardColor.RED, aCard.getColor());
        //Green
        aCard = new ActionCard(CardType.DRAW_TWO, CardColor.GREEN);
        assertEquals(CardColor.GREEN, aCard.getColor());

    }
    
    @Test
    public void testCardType() {
        //Draw Two
        assertEquals(CardType.DRAW_TWO, aCard.getType());
        //Skip
        aCard = new ActionCard(CardType.SKIP, CardColor.YELLOW);
        assertEquals(CardType.SKIP, aCard.getType());
        //Reverse
        aCard = new ActionCard(CardType.REVERSE, CardColor.YELLOW);
        assertEquals(CardType.REVERSE, aCard.getType());
    }

    @Test
    public void testEquals() {
        assertTrue(aCard.equals(new ActionCard(CardType.DRAW_TWO, CardColor.YELLOW)));
    }

    @Test
    public void testNotEquals() {
        assertFalse(aCard.equals(new ActionCard(CardType.DRAW_TWO, CardColor.RED)));
    }

    @Test
    public void testHash() {
        int hash = Objects.hash(aCard.getColor(), aCard.getType());
        assertEquals(hash, aCard.hashCode());
    }

   private ActionCard aCard; 
}
