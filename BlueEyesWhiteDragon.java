/**
 * Represents a Blue Eyes White Dragon monster, that also has a Special effect
 * @author xwu319
 * @version 1.0
 */
public class BlueEyesWhiteDragon extends MonsterCard implements Special {

    /**
     * Construct a BlueEyesWhiteDragon card
     */
    public BlueEyesWhiteDragon() {
        super("Blue Eyes White Dragon", "The best card", 3000, true);
    }

    /**
     * apply the instance effect and add two such cards in the owner's field
     * @param owner the Field of the owner's side
     * @param enemy the Field of the enemy's side
     */
    public void instantEffect(Field owner, Field enemy) {
        if (owner.addMonsterCard(this)) {
            owner.addMonsterCard(this);
        }
    }
}
