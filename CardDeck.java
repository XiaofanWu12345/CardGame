/**
 * Represents a deck of Cards specifically
 *
 * @author xwu319
 * @version 1.0
 */
public class CardDeck extends ObjectDeck {

    /**
     * Construct a Card Deck with the following parameter
     * @param cards a variable number of Cards
     */
    public CardDeck(Card ... cards) {
        super(cards);
    }

    /**
     * @return the next Card in the deck
     */
    @Override
    public Card deal() {
        return (Card) super.deal();
    }
}
