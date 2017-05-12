/**
 * Created by Amir on 5/12/2017.
 */
public abstract class SpellCard extends Card{
    public SpellCard(String name , String description){
        super(name , description);
    }
    abstract void turnEffect(Field ownerField , Field enemyField);
    abstract void destroyedEffect(Field ownerField , Field enemyField);
    @Override
    public boolean equals(Card spellCard){
        if (spellCard.getClass().getName().equals(this.getClass().getName())&&
                super.equals(spellCard))
            return true;
        return false;
    }
}
