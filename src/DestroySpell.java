/**
 * Created by Amir on 5/12/2017.
 */
public class DestroySpell extends TrapCard {
    public DestroySpell(){
        super("Destroy Spell" ,"Destroys the enemy's first spell card.");
    }
    public void instantEffect(Field owner , Field enemy){
        for(int i =0 ; i < 5 ; i ++){
            enemy.destroySpellCard(i , owner);
        }
    }
}
