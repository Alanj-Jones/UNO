
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
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
        // System.out.println(aCard);       
        assertEquals(   "Action Card {" + 
                        CardColor.YELLOW + ", " +
                        CardType.DRAW_TWO + "}" ,
                        aCard.toString());
    }
    


   private ActionCard aCard; 
}
