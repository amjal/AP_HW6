/**
 * Created by Amir on 5/12/2017.
 */
public class Field {
    private MonsterCard[] monsters  = new MonsterCard[5];
    private SpellCard[] spells = new SpellCard[5];
    public MonsterCard[] getMonsters(){
        return monsters;
    }
    public SpellCard[] getSpells(){
        return spells;
    }
    public void setMonster(MonsterCard monster , int index){
        monsters[index] = monster;
    }
    public void destroySpellCard(int index , Field enemyField){
        if (spells[index] != null)
            spells[index].destroyedEffect(this , enemyField);
        spells[index] = null;
    }
    void cardTurnEffects(Field enemyField){
        for(int i =0 ; i < 5 ;  i++ ){
            if (monsters[i] != null)
                monsters[i].setCanAttack(true);
        }
        for (int i =0 ; i <5 ; i ++){
            if (spells[i] != null){
                spells[i].turnEffect(this , enemyField);
            }
        }
    }
    boolean addMosnterCard(MonsterCard card){
        for(int i =0 ; i < 5 ; i ++){
            if (monsters[i] == null) {
                monsters[i] = card;
                return true;
            }
        }
        return false;
    }
    boolean addSpellCard(SpellCard card){
        for(int i =0 ; i < 5 ; i ++){
            if (spells[i] == null) {
                spells[i] = card;
                return true;
            }
        }
        return false;
    }
}
