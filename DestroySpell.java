/**
 * Represents a Trap Card that has the ability to destroy an opponent’s Spell
 * Card
 * @author xwu319
 * @version 1.0
 */
public class DestroySpell extends TrapCard {
    /**
     * construct a DestroySpell Card
     */
    public DestroySpell() {
        super("Destroy Spell", "Destroys the enemy's first spell card.");
    }

    /**
     * Represents an instant effect that destroys an opponent’s Spell Card
     * @param owner the Field of the owner's side
     * @param enemy the Field of the enemy's side
     */
    public void instantEffect(Field owner, Field enemy) {
        enemy.getSpells()[0].destroyedEffect(enemy, owner);
    }
}
