/**
 * Represents a deck of Specials specifically
 *
 * @author xwu319
 * @version 1.0
 */
public class SpecialDeck extends ObjectDeck {

    /**
     * Construct a deck of Specials with the following parameter
     * @param specials a variable number of Specials to put into the deck
     */
    public SpecialDeck(Special... specials) {
        super(specials);
    }

    /**
     *@return the next Special in the deck
     */
    @Override
    public Special deal() {
        return (Special) super.deal();
    }
}
