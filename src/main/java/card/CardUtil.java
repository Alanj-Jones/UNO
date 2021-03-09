package src.main.java.card;

public class CardUtil {
    // Validate color ->Card Color          void
    // Validate Number ->int                void
    //  ValidateAction type -> cardType     void
    //  isWildCard ->Card                   bool

    public static void validateColor(CardColor color) {
        if (color == null) {
            throw new IllegalArgumentException("Card color can't be null");
        }
    }

    public static void validateNumber(int number) {
        if (number<0 || number>9) {
            throw new IllegalArgumentException("Card number should be between 0 & 9");
        }
    }

    public static void validateActionType(CardType type) {
        if (type == CardType.SKIP || type == CardType.REVERSE || type == CardType.DRAW_TWO) {
            return ;
        }

        throw new IllegalArgumentException("Invalid action type");
    }

    public static boolean isWildCard(ICard card) {
        if (card.getType() == CardType.WILD_COLOR || card.getType() == CardType.WILD_DRAW_FOUR) {
            return true;
        }
        return false;
    }
}
