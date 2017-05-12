/**
 * Created by Amir on 5/12/2017.
 */
public class PowerCard extends SpellCard{
    public PowerCard(){
        super("Power Card" , "Increases power of monsters by 100 each turn");
    }
    @Override
    void turnEffect(Field ownerField , Field enemyField){
        MonsterCard[] monsters = ownerField.getMonsters();
        for(int i =0 ; i < 5 ; i ++){
            if(monsters[i] != null){
                monsters[i].setPower(monsters[i].getPower() +100);
                ownerField.setMonster(monsters[i] , i);
            }
        }
    }
    @Override
    void destroyedEffect(Field ownerField , Field enemyField){
        MonsterCard[] monsters = ownerField.getMonsters();
        for(int i =0 ; i < 5 ; i ++){
            if(monsters[i] != null){
                monsters[i].setPower(monsters[i].getPower() +100);
                ownerField.setMonster(monsters[i] , i);
            }
        }
    }

}
