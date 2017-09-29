/**
 * Represents a single player’s side of the game field that the cards can be
 * placed on
 *
 * @author xwu319
 * @version 1.0
 */
public class Field {
    private MonsterCard[] monsters = new MonsterCard[5];
    private SpellCard[] spells = new SpellCard[5];

    /**
     * @return the array that stores Monster Cards currently on the field
     */
    public MonsterCard[] getMonsters() {
        return monsters;
    }

    /**
     * @return the array that stores Spell Cards currently on the field
     */
    public SpellCard[] getSpells() {
        return spells;
    }

    /**
     * apply the turnEffects for every spell currently on this field, and also
     * set all monsters on the field to be able to attack
     * @param enemyField represents the field of the enemy's side
     */
    public void cardTurnEffects(Field enemyField) {
        for (SpellCard s : spells) {
            if (s != null) {
                s.turnEffect(this, enemyField);
            }
        }
        for (MonsterCard m : monsters) {
            if (m != null) {
                m.setCanAttack(true);
            }
        }
    }

    /**
     * add card to the first null spot in the monsters array
     * @param card a Monster Card to be added to the monsters array
     * @return true if successfully added or false if there is no space in array
     */
    public boolean addMonsterCard(MonsterCard card) {
        for (int i = 0; i < monsters.length; i++) {
            if (monsters[i] == null) {
                monsters[i] = card;
                return true;
            }
        }
        return false;
    }

    /**
     * add card to the first null spot in the spells array
     * @param card a Spell Card to be added to the spells array
     * @return true if successfully added or false if there is no space in array
     */
    public boolean addSpellCard(SpellCard card) {
        for (int i = 0; i < spells.length; i++) {
            if (spells[i] == null) {
                spells[i] = card;
                return true;
            }
        }
        return false;
    }
}
