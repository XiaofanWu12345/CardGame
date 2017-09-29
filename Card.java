/**
 * Represents a card that can be played in the game
 *
 * @author xwu319
 * @version 1.0
 */
public abstract class Card {
    private String name;
    private String description;

    /**
     * Creates a card with the following parameter
     * @param name the name of a Card
     * @param description the description of the Card
     */
    public Card(String name, String description) {
        this.name = name;
        this.description = description;
    }

    /**
     * Set the card's name with following parameter
     * @param name the name of the card
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the card's description with the following parameter
     * @param description a description of the card
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Get the card's name
     * @return this card's name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the card's description
     * @return this card's description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Determine whether two cards equal each other
     * @param other a Card object that represents the other card
     * @return a boolean value true when cards equal each other false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof Card) {
            return (name.equals(((Card) other).getName())
                    && description.equals(((Card) other).getDescription()));
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

    /**
     * @return the string representation of the card
     */
    public String toString() {
        return name + ": " + description;
    }
}
