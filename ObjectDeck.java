/**
 * Represents a Deck of Objects
 * @author xwu319
 * @version 1.0
 */
public abstract class ObjectDeck {
    private Object[] obarr;
    private int n;

    /**
     * Construct an Object Deck with the following parameter
     * @param objects an array of objects to put into the deck
     */
    public ObjectDeck(Object[] objects) {
        obarr = objects;
        n = obarr.length;
    }

    /**
     * @return the next item in the deck
     */
    public Object deal() {
        if (isEmpty()) {
            return null;
        } else {
            Object o = obarr[n - 1];
            n--;
            return o;
        }
    }

    /**
     * @return the number of items in the deck
     */
    public int size() {
        return n;
    }

    /**
     * @return true if there are no more items in the deck otherwise false
     */
    public boolean isEmpty() {
        return (n == 0);
    }
}
