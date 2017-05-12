/**
 * Created by Amir on 5/12/2017.
 */
public abstract class TrapCard extends Card implements  Special{
    public TrapCard(String name , String description){
        super(name , description);
    }
    public boolean equals(TrapCard trapCard){
        if (trapCard.getClass().getName().equals(this.getClass().getName())
                && super.equals(trapCard))
            return true;
        return false;
    }
}
