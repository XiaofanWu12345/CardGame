/**
 * Represents a player in the game that has decks and a hand and such
 * @author xwu319
 * @version 1.0
 */
public class Player {
    private CardDeck mainDeck;
    private SpecialDeck specialDeck;
    private Card[] hand = new Card[5];
    private Special nextSpecial;
    private int lifePoints;

    /**
     * Construct a player with the following parameters
     * @param md main Deck of the player holding a deck of Cards
     * @param sd special Deck holding a deck of Specials
     * @param lf life points of the player
     */
    public Player(CardDeck md, SpecialDeck sd, int lf) {
        mainDeck = md;
        specialDeck = sd;
        lifePoints = lf;
    }

    /**
     * Construct a player with the following parameters and set life points to
     * 5000
     * @param md main Deck of the player holding a deck of Cards
     * @param sd special Deck holding a deck of Specials
     */
    public Player(CardDeck md, SpecialDeck sd) {
        this(md, sd, 5000);
    }

    /**
     *set the array of Cards in the Player's hand
     * @param h an array of Cards to be holded in the Player's hand
     */
    public void setHand(Card[] h) {
        hand = h;
    }

    /**
     * @return the array of Cards in Player's hand
     */
    public Card[] getHand() {
        return hand;
    }

    /**
     * set the Player's nect Special Card to be played
     * @param nxts the nect Special Card to be set for Player to play
     */
    public void setNextSpecial(Special nxts) {
        nextSpecial = nxts;
    }

    /**
     * @return the next Special that the Player will play
     */
    public Special getNextSpecial() {
        return nextSpecial;
    }

    /**
     *set the Player's life points with the following parameter
     * @param lf represents Player's life points
     */
    public void setLifePoints(int lf) {
        lifePoints = lf;
    }

    /**
     * @return the Player's current Life Points
     */
    public int getLifePoints() {
        return lifePoints;
    }

    /**
     * attempt to draw count cards from the mainDeck into the hand array
     * @param count the number of cards to draw
     * @return true if draw successfully false otherwise
     */
    public boolean draw(int count) {
        if (mainDeck.size() < count) {
            return false;
        } else {
            for (int i = 0, n = 0; i < hand.length && n < count; i++) {
                if (hand[i] == null) {
                    hand[i] = mainDeck.deal();
                    n++;
                }
            }
            return true;
        }
    }

    /**
     * fill nextSpecial with the next card in the specialDeck if nextSpecial
     * is null
     */
    public void drawSpecialCard() {
        if (nextSpecial == null) {
            nextSpecial = specialDeck.deal();
        }
    }

    /**
     * attempt to draw one card from the mainDeck, and if it cannot,
     * will deduct 500 lifepoints
     * Will also attempt to draw a Special card into the nextSpecial position
     */
    public void nextTurnPrep() {
        if (!draw(1)) {
            lifePoints -= 500;
        }
        drawSpecialCard();
    }

    /**
     * should add the card at index whichCard in the hand onto myField
     * @param whichCard the index of the card in hand
     * @param myField represents the field of the Player's own side
     * @return true if add successfully false otherwise
     */
    public boolean playCardFromHand(int whichCard, Field myField) {
        if (whichCard >= hand.length || hand[whichCard] == null) {
            return false;
        } else {
            if (hand[whichCard] instanceof MonsterCard) {
                if (!myField.addMonsterCard((MonsterCard) hand[whichCard])) {
                    return false;
                } else {
                    hand[whichCard] = null;
                }
            } else if (hand[whichCard] instanceof SpellCard) {
                if (!myField.addSpellCard((SpellCard) hand[whichCard])) {
                    return false;
                } else {
                    hand[whichCard] = null;
                }
            } else if (hand[whichCard] instanceof TrapCard) {
                hand[whichCard] = null;
            }
            return true;
        }
    }

    /**
     * works similarly to playCardFromHand, but only tries to play nextSpecial
     * clear nextSpecial if it is played successfully
     * @param myField represents the Player's own field
     * @return true if plays successfully false otherwise
     */
    public boolean playSpecial(Field myField) {
        if (nextSpecial == null) {
            return false;
        } else {
            if (nextSpecial instanceof MonsterCard) {
                if (!myField.addMonsterCard((MonsterCard) nextSpecial)) {
                    return false;
                }
            } else if (nextSpecial instanceof SpellCard) {
                if (!myField.addSpellCard((SpellCard) nextSpecial)) {
                    return false;
                }
            }
            nextSpecial = null;
            return true;
        }
    }

    /**
     * add change to the current life points
     * @param change the change of lifepoints
     */
    public void changeLifePoints(int change) {
        lifePoints += change;
    }

    /**
     * @return true if the Player's life points if less or equal to 0
     */
    public boolean isDefeated() {
        return (lifePoints <= 0);
    }
}
