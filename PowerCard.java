/**
 * Represents a Spell Card that increases the power of monsters on its owner’s
 * side of the field each turn, or decreases their power once destroyed
 * @author xwu319
 * @version 1.0
 */
public class PowerCard extends SpellCard {
    /**
     * Constuct a Power Card
     */
    public PowerCard() {
        super("Power Card", "Increases power of monsters by 100 each turn.");
    }

    /**
     * Represents the Power Card's effect at each turn, increase owner side's
     * monsters' power
     * @param ownerField the Field of the owner's side
     * @param enemyField the Field of the enemy's side
     */
    public void turnEffect(Field ownerField, Field enemyField) {
        for (MonsterCard ms : ownerField.getMonsters()) {
            if (ms != null) {
                int p = ms.getPower();
                p += 100;
                ms.setPower(p);
            }
        }
    }

    /**
     * Represents the Power Card's effect when destroyed, decrease owner side's
     * monsters' power
     * @param ownerField the Field of the owner's side
     * @param enemyField the Field of the enemy's side
     */
    public void destroyedEffect(Field ownerField, Field enemyField) {
        for (MonsterCard ms : ownerField.getMonsters()) {
            if (ms != null) {
                int p = ms.getPower();
                p -= 300;
                ms.setPower(p);
            }
        }
    }
}
