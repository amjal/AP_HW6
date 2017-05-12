/**
 * Created by Amir on 5/12/2017.
 */
public class MonsterCard extends Card{
    private int power;
    private int basePower;
    private boolean canAttack;
    public MonsterCard(String name , String description , int power , boolean canAttack){
        super(name , description);
        this.power = power;
        this.canAttack = canAttack;
    }
    public MonsterCard(String name , String description , int power){
        this(name , description , power , false);
    }
    public int getPower(){
        return power;
    }
    public int getBasePower(){
        return basePower;
    }
    public boolean canAttack(){
        return canAttack;
    }
    public void setPower(int power){
        this.power = power;
    }
    public void setBasePower(int basePower){
        this.basePower = basePower;
    }
    public void setCanAttack(boolean canAttack){
        this.canAttack = canAttack;
    }
    @Override
    public boolean equals(Card monsterCard){
        if (monsterCard.getClass().getName().equals(this.getClass().getName()) &&
                super.equals(monsterCard) && power ==((MonsterCard) monsterCard).getPower() &&
                basePower == ((MonsterCard)monsterCard).getBasePower()) return true;
        return false;
    }
    public String toString(){
        return super.toString() + " | Power: "+ power + " | Can Attack :" + canAttack;
    }
}
