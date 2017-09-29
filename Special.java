/**
 * an interface that a card can implement if it can be summoned to the field
 * from the special deck, and instantly cause an effect when summoned
 * @author xwu319
 * @version 1.0
 */
public interface Special {

   /**
    * Represent the instant effect of a special card
    * @param owner the field of the owner's side
    * @param enemy the field of the enemy's side
    */
    void instantEffect(Field owner, Field enemy);
}
