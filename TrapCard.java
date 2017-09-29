/**
 * Represents a card that has some instant effect and does not actually get
 * placed onto the Field
 *
 * @author xwu319
 * @version 1.0
 */
public abstract class TrapCard extends Card implements Special {
    /**
     * Constructs a Trap Card with the following parameters
     * @param name the name of the Trap Card
     * @param des the description of the Trap Card
     */
    public TrapCard(String name, String des) {
        super(name, des);
    }

    /**
    * Represent the instant effect of a special card
    * @param owner the field of the owner's side
    * @param enemy the field of the enemy's side
    */
    public abstract void instantEffect(Field owner, Field enemy);

    /**
     * compares cards based on their names and descriptions
     * @param other a Card object that represents the other Trap Card
     * @return true if they equal false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof TrapCard) {
            return super.equals(other);
        } else {
            return false;
        }
    }

    /**
     * hashCode method
     * @return an integer
     */
    public int hashCode() {
        return 1;
    }
}
