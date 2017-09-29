/**
 * Represents a spell card that has an effect that it applies every turn, and
 * also applies some effect when it gets destroyed
 *
 * @author xwu319
 * @version 1.0
 */
public abstract class SpellCard extends Card {

    /**
     * Construct a Spell Card with the following parameters
     * @param name the name of the Spell Card
     * @param des the description of the Spell Card
     */
    public SpellCard(String name, String des) {
        super(name, des);
    }

    /**
     * the effect of the Spell Card that gets applied every turn
     * @param ownerField the field of the owner's side
     * @param enemyField the field of the enemy's side
     */
    public abstract void turnEffect(Field ownerField, Field enemyField);

    /**
     * the effect gets applied when the Spell Card is destroyed
     * @param ownerField the field of the owner's side
     * @param enemyField the field of the enemy's side
     */
    public abstract void destroyedEffect(Field ownerField, Field enemyField);

    /**
     * Determine whether the Spell Card is equal to another Spell Card
     * @param other a Card object that represents the other Spell Card
     * @return true if two cards equal otherwise false
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof SpellCard) {
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
