/**
 * Represents a Monster Card in the game
 *
 * @author xwu319
 * @version 1.0
 */
public class MonsterCard extends Card {
    private int power;
    private int basePower;
    private boolean canAttack;

    /**
     * Construct a Monster Card in the game with the following parameters
     * @param name the name of the Monster Card
     * @param des the description of the Monster Card
     * @param power the current attack power of the monster
     * @param canAttack true if the monster can attack at a given turn otherwise
     * false
     */
    public MonsterCard(String name, String des, int power, boolean canAttack) {
        super(name, des);
        this.power = power;
        this.canAttack = canAttack;
        basePower = power;
    }

    /**
     * Construct a Monster Card with the parameters and set canAttack to false
     * @param name the name of the Monster Card
     * @param des the description of the Monster Card
     * @param power the current attack power of the monster
     */
    public MonsterCard(String name, String des, int power) {
        this(name, des, power, false);
    }

    /**
     * set the power of the Monster Card
     *@param p the power of the MonsterCard to set
     */
    public void setPower(int p) {
        power = p;
    }

    /**
     * @return te power of the Monster Card
     */
    public int getPower() {
        return power;
    }

    /**
     * @return the basepower of the Monster Card
     */
    public int getBasePower() {
        return basePower;
    }


    /**
     * set the CanAttack of the Monster Card to the following parameter
     * @param ca whether the Monster Card can attack
     */
    public void setCanAttack(boolean ca) {
        canAttack = ca;
    }

    /**
     * @return the Monster Card's CanAttack
     */
    public boolean getCanAttack() {
        return canAttack;
    }

    /**
     * Determine whether the Monster Card equals another Monster Card
     * @param other a Card object that represents the other Monster Card
     * @return a boolean value that is true if two cards equal ottherwise false
     */
    @Override
    public boolean equals(Object other) {
        if (other instanceof MonsterCard) {
            MonsterCard o = (MonsterCard) other;
            return (super.equals(o) && power == o.getPower() && basePower
                    == o.getBasePower());
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
     * @return the string representation of the Monster Card
     */
    @Override
    public String toString() {
        return super.toString() + " | Power: " + power + " | Can attack: "
                + canAttack;
    }
}
